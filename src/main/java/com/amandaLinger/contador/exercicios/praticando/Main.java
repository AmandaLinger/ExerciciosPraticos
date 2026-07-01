package com.amandaLinger.contador.exercicios.praticando;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;

//Filtre todos os produtos da categoria "Eletrônicos" com preço menor que R$ 1000, ordene-os pelo preço em ordem
// crescente e colete o resultado em uma nova lista

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

        //Filtre todos os produtos da categoria "Eletrônicos" com preço menor que R$ 1000, ordene-os pelo preço em
        // ordem crescente e colete o resultado em uma nova lista.
        List<Produto> produtosSelecionados = produtos.stream()
                .filter(p -> p.getCategoria() =="Eletrônicos" && p.getPreco()<1000.0)
                .sorted(Comparator.comparing(Produto::getPreco)).toList();
        System.out.println(produtosSelecionados);


        // agrupe-os por categoria
        Map<String, List<Produto>> agrupandoPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));
        System.out.println(agrupandoPorCategoria);

        //Dada a lista de produtos acima, conte quantos produtos há em cada categoria e armazene
        Map<String, Long> quantidadeProdutosPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));
        System.out.println("Quantidade de produtos por categoria: " + quantidadeProdutosPorCategoria);


        //Dada a lista de produtos acima, encontre o produto mais caro de cada categoria e armazene
        Map<String, Optional<Produto>> produtoMaisCaroPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))));
        System.out.println("Produto mais caro por categoria: " + produtoMaisCaroPorCategoria);


        //calcule o total dos preços dos produtos em cada categoria e armazene o resultado
        Map<String, Double> somaValoresPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.summingDouble(Produto::getPreco)));

        System.out.println("Soma dos valores por categoria: " + somaValoresPorCategoria);
    }
}
