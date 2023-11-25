package com.esprit.Dependency.tpDependencyInjection.dao;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;





@Service("ToDoSpringService")
public class ToDoDao implements IToDoDao {

	public List<String> getCoursesList() {

		List<String> courses = new ArrayList<String>();
		courses.add("Maven");
		courses.add("Dependency Injection");
		courses.add("Spring Data JPA");
		courses.add("Spring AOP");
		return courses;
	}
}
