package com.amandaLinger.contador.exercicios.removendoDuplicatas;

import com.amandaLinger.contador.exercicios.contador.ContadorApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//4 - Dada a lista de strings abaixo, remova as duplicatas (palavras que aparecem mais de
// uma vez) e imprima o resultado.
@SpringBootApplication
public class Duplicatas implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Duplicatas.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        palavras.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }
}
