package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Tema;
import org.generation.blogPessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tema")
public class TemaController {

	@Autowired
	private TemaRepository repository;

	/**
	 * Methodo que consulta todos os elementos
	 * 
	 * @param nome
	 * @return tras todos os elementos encontrados 
	 */

	@GetMapping
	public ResponseEntity<List<Tema>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	/**
	 * Consulta pelo id
	 * 
	 * @param nome
	 * @return os dados ligados ao nome citado no parametro
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Tema> getById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	/**
	 * Consulta pelo nome
	 * 
	 * @param nome
	 * @return os dados ligados ao nome citado no parametro
	 */
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Tema>> getByName(@PathVariable String nome) {
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(nome));
	}

	/**
	 * Adiciona uma nova postagem ou tema
	 * 
	 * @param tema
	 * @return salva a postagem
	 */
	@PostMapping
	public ResponseEntity<Tema> post(@RequestBody Tema tema) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tema));
	}

	/**
	 * Atualizar uma postategem ou tema
	 * 
	 * @param tema
	 * @return salva o novo tema ou postagem pois tem ligação
	 */
	@PutMapping
	public ResponseEntity<Tema> put(@RequestBody Tema tema) {
		return ResponseEntity.ok(repository.save(tema));
	}

	/**
	 * busca um elemento pelo id para ser deletado
	 * 
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
