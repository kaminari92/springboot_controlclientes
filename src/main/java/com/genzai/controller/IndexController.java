package com.genzai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.genzai.dao.IPersonaDao;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class IndexController {
	
	@Autowired
	private IPersonaDao personaDao;

	@GetMapping("/")
	public String inicio(Model model) {
		//log.info("Ejecutando el controlador Spring MVC");
		var personas = personaDao.findAll();
		model.addAttribute("personas",personas);
		return "index.html";
	}
}
