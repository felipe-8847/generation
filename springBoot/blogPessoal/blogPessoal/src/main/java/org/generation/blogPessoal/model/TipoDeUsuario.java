package org.generation.blogPessoal.model;

import javax.validation.constraints.NotNull;

public enum TipoDeUsuario {

	CLIENTE("CLIENTE"), VENDEDOR("VENDEDOR");

	@NotNull
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	TipoDeUsuario(String nome){
		 this.nome = nome;
	}

}
