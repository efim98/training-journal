package com.example.trainingdiary;

import com.example.trainingdiary.entities.TrainingDay;
import com.example.trainingdiary.services.TrainingDayService;
import jakarta.transaction.Transactional;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainingDayServiceUnitTest {


    @Autowired
    private TrainingDayService service;
    @Test
    @Transactional
    public void getAllTrainingDays(){
        List<TrainingDay> trainingDayList;
        trainingDayList = service.getAllTrainingDays();
        Assert.assertEquals(true,!trainingDayList.isEmpty());
    }
}
