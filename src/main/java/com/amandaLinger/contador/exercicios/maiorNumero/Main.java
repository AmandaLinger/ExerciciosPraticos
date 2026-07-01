package com.amandaLinger.contador.exercicios.maiorNumero;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


//1 - Dada a lista de números inteiros a seguir, encontre o maior número dela.

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> max = numeros.stream()
                .max(Integer::compare);

        max.ifPresent(System.out::println);
    }
}
