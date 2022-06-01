package com.genzai.dao;

import org.springframework.data.repository.CrudRepository;

import com.genzai.entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long> {

}
