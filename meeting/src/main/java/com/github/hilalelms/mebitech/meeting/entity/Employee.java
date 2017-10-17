package com.github.hilalelms.mebitech.meeting.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	private String name;
	private String surname;
	private String salary;
}
