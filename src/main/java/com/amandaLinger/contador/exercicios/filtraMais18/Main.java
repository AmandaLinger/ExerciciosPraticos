package com.amandaLinger.contador.exercicios.filtraMais18;

import java.util.Arrays;
import java.util.List;

//6 - Dado um objeto Pessoa com os campos nome e idade, filtre as pessoas com mais de 18 anos,
// extraia os nomes e imprima-os em ordem alfabética. A classe Pessoa está definida abaixo.

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 22),
                new Pessoa("Bob", 17),
                new Pessoa("Charlie", 19)
        );

        pessoas.stream().filter(p -> p.getIdade() >= 18).sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome()))
                .forEach(p -> System.out.println(p));
    }
}