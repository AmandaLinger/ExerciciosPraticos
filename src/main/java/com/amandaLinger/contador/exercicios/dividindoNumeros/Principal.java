package com.amandaLinger.contador.exercicios.dividindoNumeros;

public class Principal {
    public static void main(String[] args) {
        Divisor divisor = (a,b) ->{
            if(b==0) throw new ArithmeticException("Divisão por zero não permitida");
            return a / b;
        };
        try{
            System.out.println(divisor.dividir(10,2));
            System.out.println(divisor.dividir(10,0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
