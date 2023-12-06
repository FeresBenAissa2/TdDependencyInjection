package com.esprit.Dependency.tpDependencyInjection.services;

import java.util.List;

import com.esprit.Dependency.tpDependencyInjection.dao.IToDoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class ToDoService implements IToDoService {
	@Autowired
	@Qualifier("ToDoUmlService")
	private IToDoDao toDoDao;
	// or
	// name variable with service name
	// private IToDoDao ToDoUmlService;

	public List<String> getCoursesList() {
		return toDoDao.getCoursesList();
	}
}
