package com.github.hilalelms.mebitech.meeting.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hilalelms.mebitech.meeting.dao.DepartmentDao;
import com.github.hilalelms.mebitech.meeting.entity.Department;
import com.github.hilalelms.mebitech.meeting.service.DepartmentService;


@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentDao departmentDao;

	@Override
	public void save(Department department) {
		departmentDao.save(department);
	}

	@Override
	public void update(Department department) {
		departmentDao.save(department);
	}

	@Override
	public void delete(int id) {
		departmentDao.delete(id);
	}

	@Override
	public Department getByKey(int id) {
		return departmentDao.findOne(id);
	}

	@Override
	public List<Department> getAll() {
		List<Department> departmentList = new ArrayList<>();
		Iterator<Department> iterator=  departmentDao.findAll().iterator();
		Department department = null;
		while (iterator.hasNext()) {
			department = (Department) iterator.next();
			departmentList.add(department);
		}
		return departmentList;
	}

}
