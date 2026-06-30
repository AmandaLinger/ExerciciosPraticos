package com.amandaLinger.contador.exercicios.maiuscula;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ConvertendoParaMaiuscula implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ConvertendoParaMaiuscula.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Palavra toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.transformarPalavra("radar"));
    }
}
