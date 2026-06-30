package com.amandaLinger.contador.exercicios.multiplicacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiplicacaoPrincipal implements CommandLineRunner {
	public static void main(String[] args) {
        SpringApplication.run(MultiplicacaoPrincipal.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        MultiplicandoNumeros mult = (a, b) -> a * b;
        System.out.println(mult.multiplicacao(5, 2));
    }
}
