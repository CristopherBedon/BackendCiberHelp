package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Agente;
import com.empresa.entity.Categoria;
import com.empresa.service.AgenteService;
import com.empresa.service.CategoriaService;

@RestController
@RequestMapping("/rest/util")
@CrossOrigin(origins = "http://localhost:4200")
public class UtilsController {

	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/categoria")
	@ResponseBody
	public ResponseEntity<List<Categoria>> listaCategoria(){
		List<Categoria> lista = categoriaService.listaCategoria();
		return ResponseEntity.ok(lista);
	}
	
	@Autowired
	private AgenteService agenteService;
	
	@GetMapping("/agente")
	@ResponseBody
	public ResponseEntity<List<Agente>> listaAgente(){
		List<Agente> lista = agenteService.listaAgente();
		return ResponseEntity.ok(lista);
	}

	
}
