package com.github.hilalelms.mebitech.meeting.service;

import java.util.List;

import com.github.hilalelms.mebitech.meeting.entity.Department;

public interface DepartmentService {
	public void save(Department department);
	public void update(Department department);
	public void delete(int id);
	public Department getByKey(int id);
	public List<Department> getAll();
}
