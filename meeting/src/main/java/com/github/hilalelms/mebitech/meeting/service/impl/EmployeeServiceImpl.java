package com.github.hilalelms.mebitech.meeting.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hilalelms.mebitech.meeting.dao.EmployeeDao;
import com.github.hilalelms.mebitech.meeting.entity.Department;
import com.github.hilalelms.mebitech.meeting.entity.Employee;
import com.github.hilalelms.mebitech.meeting.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public void save(Employee employee) {
		employeeDao.save(employee);
	}

	@Override
	public void update(Employee employee) {
		employeeDao.save(employee);
	}

	@Override
	public void delete(int id) {
		employeeDao.delete(id);
	}

	@Override
	public Employee getByKey(int id) {
		return employeeDao.findOne(id);
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> employeeList = new ArrayList<>();
		Iterator<Employee> iterator=  employeeDao.findAll().iterator();
		Employee employee = null;
		while (iterator.hasNext()) {
			employee = (Employee) iterator.next();
			employeeList.add(employee);
		}
		return employeeList;
	}

}
