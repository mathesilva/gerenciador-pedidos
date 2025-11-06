package com.example.gerenciador_pedidos.repositorios;

import com.example.gerenciador_pedidos.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
