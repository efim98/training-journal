package com.example.trainingjournal.handlers;

public interface ActionHandler<TContext> {
    boolean load(TContext context);
    boolean checkAccess(TContext context);
    boolean validate(TContext context);
    boolean execute(TContext context);
}
