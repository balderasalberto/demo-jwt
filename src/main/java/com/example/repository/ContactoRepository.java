package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {

}
