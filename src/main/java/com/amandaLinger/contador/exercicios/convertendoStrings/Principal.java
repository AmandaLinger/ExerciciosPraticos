package com.amandaLinger.contador.exercicios.convertendoStrings;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

//2 - Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.

@SpringBootApplication
public class Principal implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Principal.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        palavras.stream().map(p ->p.toUpperCase()).forEach(System.out::println);
    }
}
