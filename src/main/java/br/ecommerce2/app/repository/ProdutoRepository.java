package br.ecommerce2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ecommerce2.app.model.*;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long>{

}