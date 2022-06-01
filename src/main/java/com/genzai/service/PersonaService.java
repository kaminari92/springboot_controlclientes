package com.genzai.service;

import java.util.List;

import com.genzai.entity.Persona;

public interface PersonaService {

	public List<Persona> listarPersonas();
	public void guardar(Persona persona);
	public void eliminar(Persona persona);
	public Persona buscar(Persona persona);
}
