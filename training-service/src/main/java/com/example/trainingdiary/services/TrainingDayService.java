package com.example.trainingdiary.services;

import com.example.trainingdiary.entities.TrainingDay;
import com.example.trainingdiary.repositories.TrainingDayRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingDayService {

    @Autowired
    private TrainingDayRepository repository;

    @Transactional
    public List<TrainingDay> getAllTrainingDays(){
        return repository.findAll();
    }
}
