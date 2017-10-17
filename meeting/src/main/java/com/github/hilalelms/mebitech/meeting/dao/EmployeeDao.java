package com.github.hilalelms.mebitech.meeting.dao;

import org.springframework.data.repository.CrudRepository;

import com.github.hilalelms.mebitech.meeting.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>{

}
