package br.itb.projeto.teste3h.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
	@GetMapping("test")
	public String getTest() {
		String pessoa = System.getProperty("user.name");
		pessoa = pessoa.toUpperCase();
		return "Bom dia, " + pessoa + ", seu vagabundo";
	}

	@GetMapping("message")
	public String getMessage() {
		String pessoa = System.getProperty("user.name");
		pessoa = pessoa.toUpperCase();
		return "Olá, " + pessoa + ", meu querido vagabundo";
	}

	@GetMapping("mariquinha")
	public String getMariquinha() {
		String pessoa = System.getProperty("user.name");
		pessoa = pessoa.toUpperCase();
		return "Você é um(a) mariquinha, caro(a) " + pessoa;
	}
}
