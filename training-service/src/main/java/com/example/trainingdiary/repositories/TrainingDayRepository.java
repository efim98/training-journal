package com.example.trainingdiary.repositories;

import com.example.trainingdiary.entities.TrainingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingDayRepository extends JpaRepository<TrainingDay, Integer> {
}
