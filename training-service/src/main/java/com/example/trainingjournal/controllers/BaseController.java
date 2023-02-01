package com.example.trainingjournal.controllers;

import com.example.trainingjournal.handlers.ActionContext;
import com.example.trainingjournal.handlers.ActionHanderFactory;
import com.example.trainingjournal.handlers.ActionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;



public class BaseController {

    @Autowired
    protected ActionHanderFactory actionHanderFactory;
    protected <TResult, TContext extends ActionContext<TResult>>ResponseEntity handleAction(
            TContext context,
            ActionHandler<TContext> handler
    ){
        boolean isOk = false;
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        try {
            if(!handler.checkAccess(context)){
                httpStatus = HttpStatus.FORBIDDEN;
            }
            else if(!handler.load(context)){
                httpStatus = HttpStatus.NOT_FOUND;
            }
            else if(!handler.validate(context)){
                httpStatus = HttpStatus.BAD_REQUEST;
            }
            else if(!handler.execute(context)){
                httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
            }
            else {
                isOk = true;
                httpStatus=HttpStatus.OK;
            }
            if(isOk){
                var re = ResponseEntity.ok(context.getResult());
                return re;
            }else {
                String error = httpStatus.getReasonPhrase()+context.getError();
                throw new ResponseStatusException(httpStatus, error);
            }
        } catch (ResponseStatusException responseStatusException){
            throw responseStatusException;
        } catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
        }
    }
    protected ActionHandler getActionHandler(String handlerName){
        return actionHanderFactory.getActionHandler(handlerName);
    }
}
