package com.amandaLinger.contador.exercicios.filtrandoNumeros;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//3 - Dada a lista de números inteiros abaixo, filtre os números ímpares, multiplique cada um por 2
// e colete os resultados em uma nova lista.

@SpringBootApplication
public class filtrandoNumeros implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(filtrandoNumeros.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.stream().filter(n -> !(n % 2 == 0)).map(n -> n * 2)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
