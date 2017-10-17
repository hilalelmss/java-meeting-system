	package com.github.hilalelms.mebitech.meeting.controller;

import java.lang.reflect.Type;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.github.hilalelms.mebitech.meeting.entity.Department;
import com.github.hilalelms.mebitech.meeting.service.DepartmentService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Controller
@RequestMapping(value = "/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	Gson gson = new Gson();
	
	@RequestMapping(value = "/")
	public String index() {
		return "department";
	}
	
	@RequestMapping(value = "/getAll")
	@ResponseBody
	public String getAll() {
		Type listOfTestObject = new TypeToken<List<Department>>(){}.getType();
		String json = gson.toJson(departmentService.getAll(), listOfTestObject);
		return json;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public void save(@ModelAttribute Department department) {
		departmentService.save(department);
	}
	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public void update(@ModelAttribute Department department) {
		departmentService.update(department);
	}
	
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		departmentService.delete(id);
	}
	
	
}
