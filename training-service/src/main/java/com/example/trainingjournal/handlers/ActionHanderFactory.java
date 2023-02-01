package com.example.trainingjournal.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ActionHanderFactory {

    @Autowired
    private ApplicationContext applicationContext;

    public ActionHandler getActionHandler(String name){
        return applicationContext.getBean(name, ActionHandler.class);
    }
}
