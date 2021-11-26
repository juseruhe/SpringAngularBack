package com.pagina.crud.desarrollo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping(path = {"/{id}"} )
	public Persona mostrarPersona(@PathVariable("id") int id) {
		return service.mostrarPersona(id);
	}
	
	@PutMapping(path= {"/{id}"})
	public Persona editarPersona(@RequestBody Persona p,@PathVariable("id") int id) {
		p.setId(id);
		return service.actualizarPersona(p);
	}
	
	@DeleteMapping(path = {"/{id}"})
	public Persona eliminarPersona(@PathVariable("id") int id) {
		return service.eliminarPersona(id);
	}
}
