package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Agente;

public interface AgenteRepository extends JpaRepository<Agente, String> {

	
}
