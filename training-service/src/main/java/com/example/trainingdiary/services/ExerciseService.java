package com.example.trainingdiary.services;

import com.example.trainingdiary.entities.Exercise;
import com.example.trainingdiary.repositories.ExerciseRepository;
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
