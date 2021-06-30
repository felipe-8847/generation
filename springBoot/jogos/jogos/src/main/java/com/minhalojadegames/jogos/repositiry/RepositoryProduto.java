package com.minhalojadegames.jogos.repositiry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhalojadegames.jogos.model.Produto;

@Repository
public interface RepositoryProduto extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByDescricaoContainingIgnoreCase (String nome);
}
