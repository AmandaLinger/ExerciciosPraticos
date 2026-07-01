package com.amandaLinger.contador.exercicios.trabalhandoSublistas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//5 - Dada a lista de sublistas de números inteiros abaixo, extraia todos os números primos em uma
// única lista e os ordene em ordem crescente

@SpringBootApplication
public class SubListas implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SubListas.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        List<Integer> numerosPrimos = listaDeNumeros.stream()
                .flatMap(List::stream)
                .filter(SubListas::ehPrimo)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(numerosPrimos);
    }
    private static boolean ehPrimo(int numero){
            if(numero < 2) return false;

            for(int i =2; i <= Math.sqrt(numero); i++){
                if(numero % i == 0){
                    return false;
                }
            }
            return true;
    }

}
