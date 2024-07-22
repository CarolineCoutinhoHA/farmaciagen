
package com.generation.farmaciagen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.farmaciagen.model.Produtos;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    public List<Produtos> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);


}

