package com.example.trainingdiary.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TRAININGDAY")
public class TrainingDay implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DATE")
    //@Convert(converter = DateConverter.class)
    private String date;

    @Column(name = "COMMENT")
    private String comment;

    @JsonManagedReference
    @OneToMany
    @JoinColumn(name = "TRAININGDAY_ID")
    private List<TrainRecord> trainRecords;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<TrainRecord> getTrainRecords() {
        return trainRecords;
    }

    public void setTrainRecords(List<TrainRecord> trainRecords) {
        this.trainRecords = trainRecords;
    }
}
