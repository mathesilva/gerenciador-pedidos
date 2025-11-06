package com.example.gerenciador_pedidos;

import com.example.gerenciador_pedidos.repositorios.CategoriaRepository;
import com.example.gerenciador_pedidos.repositorios.PedidoRepository;
import com.example.gerenciador_pedidos.repositorios.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

public class Principal{
    private ProdutoRepository repository;
    private CategoriaRepository repositoryCategoria;
    private PedidoRepository repositoryOrder;

    public Principal(ProdutoRepository repository, CategoriaRepository repositoryCategoria, PedidoRepository repositoryOrder) {
        this.repository = repository;
        this.repositoryCategoria = repositoryCategoria;
        this.repositoryOrder = repositoryOrder;
    }

    public void saveDados(){
        Produto produto = new Produto(null, "Mouse", 3500.0);
        Categoria categoria = new Categoria(4L, "Eletrônicos");
        Pedido pedido = new Pedido(3L, LocalDate.now());
        repository.save(produto);
        repositoryCategoria.save(categoria);
        repositoryOrder.save(pedido);

    }

}

