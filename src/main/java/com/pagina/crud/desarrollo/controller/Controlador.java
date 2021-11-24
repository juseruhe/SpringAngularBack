package com.pagina.crud.desarrollo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pagina.crud.desarrollo.models.Persona;
import com.pagina.crud.desarrollo.service.PersonaService;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping({"/personas"})
public class Controlador {

	@Autowired
	PersonaService service;
	
	@GetMapping
	public List<Persona>mostrarPersonas(){
		return service.mostrarPersonas();
	}
	
	@PostMapping
	public Persona insertarPersona(@RequestBody Persona p) {
		return service.insertarPersona(p);
	}
}
