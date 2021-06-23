package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivosDeAprendizagem {

	@GetMapping
	public String objetivo() {
		return "Aprender sprig boot, rest api, rest full, controller, model e "
				+ "criar classe de modo correto com cada classe ou entidade em seu respequitivo lugar.";
	}
}
