package com.example.trainingdiary.handlers;

public interface ActionContext <TResult>{
    String getError();
    void setError(String error);
    TResult getResult();
    void setResult(TResult result);
}
