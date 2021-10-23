package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Agente;
import com.empresa.repository.AgenteRepository;

@Service
public class AgenteServiceImpl implements AgenteService {

	@Autowired
	private AgenteRepository repository;

	@Override
	public List<Agente> listaAgente() {
		return repository.findAll();
	}

	
	

}
