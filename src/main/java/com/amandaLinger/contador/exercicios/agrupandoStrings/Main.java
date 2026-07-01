package com.amandaLinger.contador.exercicios.agrupandoStrings;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//2 -Dada a lista de palavras (strings) abaixo, agrupe-as pelo seu tamanho.

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer,List<String>> agrupamento = palavras.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(agrupamento);
    }
}
