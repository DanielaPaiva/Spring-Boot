package com.turma2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turma2.model.Turma;

public interface TurmaRepository extends JpaRepository<Turma,Long> {
	public List<Turma>findAllBytipoTurmaContainingIgnoreCase(String tipoTurma);

}
