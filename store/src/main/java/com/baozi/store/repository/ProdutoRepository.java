package com.baozi.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.baozi.store.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
