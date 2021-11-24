package com.pagina.crud.desarrollo.service;

import java.util.List;

import com.pagina.crud.desarrollo.models.Persona;

public interface PersonaService {

	List<Persona> mostrarPersonas();
	Persona mostrarPersona(int id);
	Persona insertarPersona(Persona p);
	Persona actualizarPersona(Persona p);
	Persona eliminarPersona(int id);
}
