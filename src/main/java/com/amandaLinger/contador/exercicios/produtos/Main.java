package com.amandaLinger.contador.exercicios.produtos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//7 - Você tem uma lista de objetos do tipo Produto, onde cada produto possui os atributos nome (String),
// preco (double) e categoria (String). Filtre todos os produtos da categoria "Eletrônicos" com preço menor
// que R$ 1000, ordene-os pelo preço em ordem crescente e colete o resultado em uma nova lista.

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        List<Produto> produtosFiltrados = produtos.stream().filter( p -> p.getCategoria() == "Eletrônicos" && p.getPreco() < 1000)
                .sorted((p1, p2) -> Double.compare(p2.getPreco(), p1.getPreco()))
                .collect(Collectors.toList());

        System.out.println(produtosFiltrados);

        List<Produto> produtosMaisBaratos = produtos.stream()
                .filter(p -> p.getCategoria() == "Eletrônicos")
                .filter(p -> p.getPreco() < 1000)
                .sorted((p1, p2) -> Double.compare(p2.getPreco(), p1.getPreco()))
                .limit(3).collect(Collectors.toList());
        System.out.println(produtosMaisBaratos);
    }
}
