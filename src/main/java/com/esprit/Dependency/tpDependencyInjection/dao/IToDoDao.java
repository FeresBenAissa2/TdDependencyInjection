package com.esprit.Dependency.tpDependencyInjection.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.annotation.QueryAnnotation;

import java.util.List;
@Qualifier
public interface IToDoDao {
	public List<String> getCoursesList();
}
