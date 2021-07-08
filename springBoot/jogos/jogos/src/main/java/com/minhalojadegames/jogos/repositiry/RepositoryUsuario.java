package com.minhalojadegames.jogos.repositiry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhalojadegames.jogos.model.Usuario;

@Repository
public interface RepositoryUsuario extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findByUsuario (String usuario); 
}
