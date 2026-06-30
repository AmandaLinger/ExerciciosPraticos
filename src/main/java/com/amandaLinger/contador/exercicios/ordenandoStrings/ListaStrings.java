package com.amandaLinger.contador.exercicios.ordenandoStrings;

import java.util.Arrays;
import java.util.List;

public class ListaStrings {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("a","i","b","e","f","g","h","c","d");
        lista.sort((a,b) -> a.compareTo(b));
        System.out.println(lista);
    }
}
