package com.esprit.Dependency.tpDependencyInjection.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Primary
@Service("ToDoUmlService")
public class ToDoDao2 implements IToDoDao {

	public List<String> getCoursesList() {

		List<String> courses = new ArrayList<String>();
		courses.add("diagramme de cas utilisation");
		courses.add("diagramme de classes");
		courses.add("diagramme de séquences");
		courses.add("diagramme état transition");
		return courses;
	}
}
