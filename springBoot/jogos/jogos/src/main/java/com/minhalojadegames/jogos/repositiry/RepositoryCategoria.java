package com.minhalojadegames.jogos.repositiry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhalojadegames.jogos.model.Categoria;

@Repository 
public interface RepositoryCategoria extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByNomeContainingIgnoreCase (String descricao);
}
