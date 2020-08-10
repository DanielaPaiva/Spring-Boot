package com.blog_pessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog_pessoal.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario,Long>{
	public Optional<Usuario>findByUsuario(String usuario);
}
