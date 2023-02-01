package com.example.trainingjournal.services;

import com.example.trainingjournal.entities.Exercise;
import com.example.trainingjournal.repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {
    @Autowired
    private ExerciseRepository repository;

    public List<Exercise> getAllExercises(){
        return repository.findAll();
    }
}
