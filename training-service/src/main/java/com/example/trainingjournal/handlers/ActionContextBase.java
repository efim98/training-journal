package com.example.trainingjournal.handlers;

public abstract class ActionContextBase<T> implements ActionContext<T> {
    private String error="";
    private T result;
    @Override
    public String getError() {
        return error;
    }

    @Override
    public void setError(String error) {
        this.error=error;
    }

    @Override
    public T getResult() {
        return result;
    }

    @Override
    public void setResult(T t) {
        this.result=t;
    }
}
