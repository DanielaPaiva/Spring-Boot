package com.turma.turma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turma.turma.model.Turma;
import com.turma.turma.repository.TurmaRepository;

@RestController
@RequestMapping("/turma")
@CrossOrigin("*")

public class TurmaController {
	@Autowired
	private TurmaRepository repository;
	
	@GetMapping
	public ResponseEntity<java.util.List<Turma>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Turma>GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping
	public ResponseEntity<Turma>Post (@RequestBody Turma turma){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(turma));
	}
	
	@PutMapping
	public ResponseEntity<Turma>Put(@RequestBody Turma turma){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(turma));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
