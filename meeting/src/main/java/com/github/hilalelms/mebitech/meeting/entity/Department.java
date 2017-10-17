package com.github.hilalelms.mebitech.meeting.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
public @Data class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	private String name;
	private String description;
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "LOOKUP_DEPARTMENT_EMPLOYEE", 
	joinColumns = { @JoinColumn(name = "DEPARTMENT_ID") }, 
	inverseJoinColumns = { @JoinColumn(name = "EMPLOYEE_ID") })
	private List<Employee> employeeList;
}
