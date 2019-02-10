package com.rkoneru.sample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

    @GeneratedValue
    @Id
    private Long id;
}
