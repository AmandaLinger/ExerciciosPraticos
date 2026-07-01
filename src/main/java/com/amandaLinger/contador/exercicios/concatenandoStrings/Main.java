package com.amandaLinger.contador.exercicios.concatenandoStrings;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//3 - Dada a lista de nomes abaixo, concatene-os separados por vírgula.

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

        var stringsConcatenadas = nomes.stream()
                .collect(Collectors.joining(", "));

        System.out.println(stringsConcatenadas);
    }
}
