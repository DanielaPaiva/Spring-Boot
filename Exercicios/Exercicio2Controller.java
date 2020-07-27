package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio")
public class Exercicio2Controller 
{
	@GetMapping
	public String exer() 
		{
			return "Objetivos de aprendizagem para essa semana: Absorver o máximo de conteudo e ter muita persistencia!!";
		}
}
