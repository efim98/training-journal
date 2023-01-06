package com.example.trainingdiary.handlers;

import com.example.trainingdiary.entities.Exercise;

import java.util.List;

public class ExercisesContext implements ActionContext<List<Exercise>> {
    private List<Exercise> result;
    private String error;

    @Override
    public String getError() {
        return error;
    }

    @Override
    public void setError(String error) {
        this.error=error;
    }

    @Override
    public List<Exercise> getResult() {
        return result;
    }

    @Override
    public void setResult(List<Exercise> exercises) {
        this.result=exercises;
    }
}
