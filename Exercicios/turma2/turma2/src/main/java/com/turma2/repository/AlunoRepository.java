package com.turma2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turma2.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {
	public List<Aluno>findAllByNomeContainingIgnoreCase(String nome);
	

}
