package com.example.gerenciador_pedidos;

import com.example.gerenciador_pedidos.repositorios.ProdutoRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(name = "valor")
    private Double preco;


    public Produto(Long id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }


    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
