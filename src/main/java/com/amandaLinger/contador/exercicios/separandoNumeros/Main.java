package com.amandaLinger.contador.exercicios.separandoNumeros;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

//5 - Dada uma lista de números inteiros, separe os números pares dos ímpares.

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);


    }
}
