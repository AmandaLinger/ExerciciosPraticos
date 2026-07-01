package com.amandaLinger.contador.exercicios.filtrandoPares;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
//1 - Dada a lista de números inteiros abaixo, filtre apenas os números pares e imprima-os.

@SpringBootApplication
public class Principal implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Principal.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        numeros.stream().filter(n -> n % 2 ==0).forEach(System.out::println);
    }
}
