package com.amandaLinger.contador.exercicios.expressaoMatematica;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

//3 - Dada a lista de nomes abaixo, concatene-os separados por vírgula.

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        var calculaSomaQuadradosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(calculaSomaQuadradosPares);
    }
}
