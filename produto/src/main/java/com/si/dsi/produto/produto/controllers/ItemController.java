package com.si.dsi.produto.produto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/itens")
public class ItemController {

	@GetMapping
	public void teste() {
		System.out.println("teste");
	}
}
