package com.example.trainingdiary.services;

import com.example.trainingdiary.entities.Exercise;
import com.example.trainingdiary.repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;

@Service
public interface ExerciseService  extends BaseService<Exercise, Integer>{
}
