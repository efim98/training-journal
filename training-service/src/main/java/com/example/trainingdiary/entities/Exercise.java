package com.example.trainingdiary.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "EXERCISE")
public class Exercise implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Name")
    private String Name;
}
