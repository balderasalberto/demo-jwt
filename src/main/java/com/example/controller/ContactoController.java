package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Contacto;
import com.example.repository.ContactoRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("contactos")
@AllArgsConstructor
public class ContactoController {

	private final ContactoRepository contactoRepository;

	@GetMapping
	public List<Contacto> listContactos() {
		return contactoRepository.findAll();
	}
}
