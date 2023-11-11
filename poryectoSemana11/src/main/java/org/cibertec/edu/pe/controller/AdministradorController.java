package org.cibertec.edu.pe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class AdministradorController {
	
	@GetMapping("")
	public String home() {
		return "/home";
	}
}
