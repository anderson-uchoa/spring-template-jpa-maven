package br.quixada.superball.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("formulario")
public class FormularioController {

	private static final String PATH_FORM_LOGIN = "formulario/login";


	@RequestMapping(value = "/login")
	public String login() {

		return PATH_FORM_LOGIN;
	}

	
}