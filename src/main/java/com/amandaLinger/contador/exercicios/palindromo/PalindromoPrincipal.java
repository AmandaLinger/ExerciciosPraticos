package com.amandaLinger.contador.exercicios.palindromo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PalindromoPrincipal implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PalindromoPrincipal.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Palindromo palindromo = p -> p.equals(new StringBuilder(p).reverse().toString());
        System.out.println(palindromo.verificaPalindromo("radar"));
        System.out.println(palindromo.verificaPalindromo("java"));
    }
}
