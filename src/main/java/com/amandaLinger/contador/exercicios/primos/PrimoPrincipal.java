package com.amandaLinger.contador.exercicios.primos;

import com.amandaLinger.contador.ContadorApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimoPrincipal implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(PrimoPrincipal.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Primo primo = n -> {
            if(n<= 1) return false;
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) return false;
            }
            return true;
        };
        System.out.println(primo.verificaPrimo(11));
        System.out.println(primo.verificaPrimo(12));
    }
}
