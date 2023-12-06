package com.esprit.Dependency.tpDependencyInjection.controller;

import java.util.List;


import com.esprit.Dependency.tpDependencyInjection.services.IToDoService;
import com.esprit.Dependency.tpDependencyInjection.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class ToDoController {
	@Autowired
	IToDoService iToDoService;

	public List<String> getCoursesList() {
		return iToDoService.getCoursesList();
	}
}
