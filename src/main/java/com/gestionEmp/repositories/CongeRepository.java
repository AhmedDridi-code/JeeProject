package com.gestionEmp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionEmp.entities.Conge;

@Repository
public interface CongeRepository extends JpaRepository<Conge, Long> {

}
