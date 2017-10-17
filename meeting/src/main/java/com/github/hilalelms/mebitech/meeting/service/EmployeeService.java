package com.github.hilalelms.mebitech.meeting.service;

import java.util.List;

import com.github.hilalelms.mebitech.meeting.entity.Employee;

public interface EmployeeService {
	public void save(Employee employee);
	public void update(Employee employee);
	public void delete(int id);
	public Employee getByKey(int id);
	public List<Employee> getAll();
}
