package org.example;

public class Main {
    public static void main(String[] args) {
        Comparador<String> comparador = new Comparador<>();
        System.out.println(comparador.sonIguales("Hola", "Hola"));
        System.out.println(comparador.sonIguales("Hola", "Mundo"));

        Comparador<Integer> compNumeros = new Comparador<>();
        System.out.println(compNumeros.sonIguales(20,20));
        System.out.println(compNumeros.sonIguales(15,30));
    }
}
