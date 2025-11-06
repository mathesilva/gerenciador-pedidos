package com.example.gerenciador_pedidos.repositorios;

import com.example.gerenciador_pedidos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
