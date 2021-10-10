package com.gestionEmp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionEmp.entities.Employe;
import com.gestionEmp.repositories.EmployeRepository;

@Service
public class EmployeService {
	
	@Autowired
	private EmployeRepository empRepo;
	
	public List<Employe> findAllEmployeByName(String name){
		return empRepo.getEmployeListByName(name);
	}
	
	public Employe findEmployeByLogin(String login) {
		return empRepo.getEmployeByLogin(login);
	}
}
