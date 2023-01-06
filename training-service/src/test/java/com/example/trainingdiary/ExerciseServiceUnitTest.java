package com.example.trainingdiary;

import com.example.trainingdiary.entities.Exercise;
import com.example.trainingdiary.services.ExerciseService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExerciseServiceUnitTest {


    @Test
    public void getAllExercises(){
        Assert.assertEquals(true,true);
    }
}
