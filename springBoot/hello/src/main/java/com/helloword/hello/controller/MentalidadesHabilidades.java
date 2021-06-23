package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidade")
public class MentalidadesHabilidades {

	@GetMapping
	public String mentalidade() {
		return "Persistencia e orientação ao detalhe.";
	}
}
