package com.example.trainingjournal.handlers;

import com.example.trainingjournal.services.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(ActionHandlerNames.GET_ALL_EXERCISES)
public class GetAllExercisesHandler implements ActionHandler<ExercisesContext> {

    @Autowired
    private ExerciseService service;
    @Override
    public boolean load(ExercisesContext context) {
        return true;
    }

    @Override
    public boolean checkAccess(ExercisesContext context) {
        return true;
    }

    @Override
    public boolean validate(ExercisesContext context) {
        return true;
    }

    @Override
    public boolean execute(ExercisesContext context) {
        var a = service.getAllExercises();
        context.setResult(service.getAllExercises());
        return true;
    }
}
