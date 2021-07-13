package org.generation.blogPessoal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
public class PostagemController {

	@Autowired	
	private PostagemRepository repository;

    @GetMapping
    public List<Postagem> buscarTodos () {
        return repository.findAll();
    }
 
    
    @GetMapping("/{id}")
    public ResponseEntity<Postagem> BuscarPorId(@PathVariable long id){
    return repository.findById(id).map(resp -> ResponseEntity.ok(resp))

    .orElse(ResponseEntity.notFound().build());
    
    }
   
    @GetMapping("/titulo/{titulo}")
    public ResponseEntity<List<Postagem>> BuscarPorTitulo(@PathVariable String titulo){
        return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
        
    }
    
    @PostMapping 
    public ResponseEntity<Postagem> salvarUmaPostagem (@RequestBody Postagem postagem){
    	return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
    }
   
    @PutMapping 
    public ResponseEntity<Postagem> atualizarUmaPostagem (@RequestBody Postagem postagem){
    	return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
    }
   
    @DeleteMapping("/{id}")
    public void deletarUmaPostagem (@PathVariable Long id) {
    	repository.deleteById(id);
    }
}
