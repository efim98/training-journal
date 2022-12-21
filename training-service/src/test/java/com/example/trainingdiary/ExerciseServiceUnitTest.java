package com.example.trainingdiary;

import com.example.trainingdiary.entities.Exercise;
import com.example.trainingdiary.services.ExerciseService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExerciseServiceUnitTest {

    @Autowired
    ExerciseService service;

    @Test
    public void getAllExercises(){
        List<Exercise> exerciseList = service.getAll();
        boolean check = exerciseList.size()>0;
        Assert.assertEquals(check,true);
    }
}
