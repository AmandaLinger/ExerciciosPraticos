package com.amandaLinger.contador.exercicios.separandoNumeros;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//5 - Dada uma lista de números inteiros, separe os números pares dos ímpares.

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Boolean,List<Integer>> listas = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 ==0));

        System.out.println(listas.get(true));
        System.out.println(listas.get(false));
    }
}
