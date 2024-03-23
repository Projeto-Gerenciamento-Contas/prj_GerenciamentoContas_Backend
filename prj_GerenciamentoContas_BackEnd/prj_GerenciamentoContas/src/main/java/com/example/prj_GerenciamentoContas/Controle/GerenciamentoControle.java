package com.example.prj_GerenciamentoContas.Controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GerenciamentoControle {

	@GetMapping("/")
	public String home() {
		return "pagina inicial";
	}
}
