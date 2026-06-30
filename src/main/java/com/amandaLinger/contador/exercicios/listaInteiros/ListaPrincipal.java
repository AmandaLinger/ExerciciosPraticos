package com.amandaLinger.contador.exercicios.listaInteiros;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ListaPrincipal{
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numeros.replaceAll(n -> n * 3);
        System.out.println(numeros);
    }
}
