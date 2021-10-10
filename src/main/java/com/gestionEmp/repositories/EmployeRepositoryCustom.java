package com.gestionEmp.repositories;

import java.util.List;

import com.gestionEmp.entities.Employe;

public interface EmployeRepositoryCustom {

	List<Employe> getEmployeListByName(String name);
	Employe getEmployeByLogin(String login);
	
}
