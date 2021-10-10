package com.gestionEmp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionEmp.entities.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long>, EmployeRepositoryCustom{

	
}
