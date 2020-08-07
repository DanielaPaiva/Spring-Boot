package com.farma.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farma.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
	public Optional<Usuario>findByUsuario(String Usuario);

}
