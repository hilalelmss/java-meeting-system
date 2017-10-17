package com.github.hilalelms.mebitech.meeting.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
public @Data class Meeting {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	@ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name = "LOOKUP_MEETING_DEPARTMENT", 
	joinColumns = { @JoinColumn(name = "MEETING_ID") }, 
	inverseJoinColumns = { @JoinColumn(name = "DEPARTMENT_ID") })
	private List<Department> departmentList;
}
