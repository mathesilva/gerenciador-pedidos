package com.example.gerenciador_pedidos.repositorios;

import com.example.gerenciador_pedidos.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
