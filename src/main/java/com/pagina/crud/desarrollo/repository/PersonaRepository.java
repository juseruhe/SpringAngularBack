package com.pagina.crud.desarrollo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.pagina.crud.desarrollo.models.Persona;

public interface PersonaRepository extends Repository<Persona,Integer> {
	List<Persona> findAll();
//	Persona findOne(int id);
	Persona save(Persona p);
// void delete(Persona p);

}
