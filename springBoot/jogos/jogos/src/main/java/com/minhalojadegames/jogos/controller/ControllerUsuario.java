package com.minhalojadegames.jogos.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhalojadegames.jogos.model.Usuario;
import com.minhalojadegames.jogos.model.DTO.UserLoginDTO;
import com.minhalojadegames.jogos.repositiry.RepositoryUsuario;
import com.minhalojadegames.jogos.services.UsuarioServices;

@RestController
@RequestMapping("/usuario")
public class ControllerUsuario {

	@Autowired
	private RepositoryUsuario repositoryU;
	
	@Autowired
	private UsuarioServices servicesU;

	@GetMapping("/todos")
	public ResponseEntity<List<Usuario>> pegarTodosUsuario() {
		List<Usuario> listaDeUsuarios = repositoryU.findAll();
		if (!listaDeUsuarios.isEmpty()) {
			return ResponseEntity.status(200).body(listaDeUsuarios);
		} else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("/id/{id_Usuario}")
	public ResponseEntity<Usuario> pegarUsuarioPorId(@PathVariable(value = "id_Usuario") Long idUsuario) {
		return repositoryU.findById(idUsuario)
				.map(usuarioExistente -> ResponseEntity.status(200).body(usuarioExistente))
				.orElse(ResponseEntity.status(204).build());
	}

	@PostMapping("/novo")
	public ResponseEntity<Usuario> novoUsuario(@Valid @RequestBody Usuario usuario) {
		return servicesU.cadastrarUsuario(usuario)
				.map(usuarioCadastrado -> ResponseEntity.status(201).body(usuarioCadastrado))
				.orElse(ResponseEntity.status(400).build());
	}

	@PostMapping("/login")
	public ResponseEntity<UserLoginDTO> autorizarUsuario(@RequestBody Optional<UserLoginDTO> usuarioLogin) {
		return servicesU.logarUsuario(usuarioLogin)
				.map(usuarioAutorizado -> ResponseEntity.status(202).body(usuarioAutorizado))
				.orElse(ResponseEntity.status(401).build());
	}
}
