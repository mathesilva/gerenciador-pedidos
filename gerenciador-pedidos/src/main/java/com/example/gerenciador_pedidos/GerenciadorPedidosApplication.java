package com.example.gerenciador_pedidos;

import com.example.gerenciador_pedidos.repositorios.CategoriaRepository;
import com.example.gerenciador_pedidos.repositorios.PedidoRepository;
import com.example.gerenciador_pedidos.repositorios.ProdutoRepository;
import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GerenciadorPedidosApplication implements CommandLineRunner{
    @Autowired
    private ProdutoRepository repository;
    @Autowired
    private CategoriaRepository repositoryCategoria;
    @Autowired
    private PedidoRepository repositoryOrder;

    public static void main(String[] args) {
        SpringApplication.run(GerenciadorPedidosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
            Principal principal = new Principal(repository, repositoryCategoria, repositoryOrder);
            principal.saveDados();
            System.out.println("Salvo no banco de dados");
        }
    }

