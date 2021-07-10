package org.generation.blogPessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Usuario {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idUsuario;
	private @NotNull(message = "O nome não pode ser nulo!") String nome;
	private @NotNull(message = "O usuario não pode ser nulo") String usuario;
	private @NotNull(message = "A senha não pode ser nula") String senha;

	public Usuario() {

	}

	public Usuario(@NotNull String usuario, @NotNull String senha) {

		this.usuario = usuario;
		this.senha = senha;
	}

	public Usuario(@NotNull String nome, @NotNull String usuario, @NotNull String senha) {

		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
