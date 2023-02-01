package com.example.trainingjournal.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TRAINRECORD")
public class TrainRecord implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TRAININGDAY_ID")
    private Integer TrainingDayId;

    @Column(name = "TRAINSET")
    private Integer trainSet;

    @ManyToOne
    @JoinColumn(name = "EXERCISE_ID")
    private Exercise exercise;

    @Column(name = "REP")
    private Integer rep;

    @Column(name = "WEIGHT")
    private Double weight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTrainingDayId() {
        return TrainingDayId;
    }

    public void setTrainingDayId(Integer trainingDayId) {
        TrainingDayId = trainingDayId;
    }


    public Integer getTrainSet() {
        return trainSet;
    }

    public void setTrainSet(Integer trainSet) {
        this.trainSet = trainSet;
    }

    public Integer getRep() {
        return rep;
    }

    public void setRep(Integer rep) {
        this.rep = rep;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
