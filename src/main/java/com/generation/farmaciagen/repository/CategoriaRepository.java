package com.generation.farmaciagen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.generation.farmaciagen.model.Categoria;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    public List<Categoria> findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);
}
