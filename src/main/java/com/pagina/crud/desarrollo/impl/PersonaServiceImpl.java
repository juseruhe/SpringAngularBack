package com.pagina.crud.desarrollo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagina.crud.desarrollo.models.Persona;
import com.pagina.crud.desarrollo.repository.PersonaRepository;
import com.pagina.crud.desarrollo.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	private PersonaRepository repositorio;

	@Override
	public List<Persona> mostrarPersonas() {
		return repositorio.findAll();
	}

	@Override
	public Persona mostrarPersona(int id) {
		return repositorio.findById(id);
	}

	@Override
	public Persona insertarPersona(Persona p) {
		return repositorio.save(p);
	}

	@Override
	public Persona actualizarPersona(Persona p) {
		return repositorio.save(p);
	}

	@Override
	public Persona eliminarPersona(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
