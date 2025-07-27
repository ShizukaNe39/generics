package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Mario", "Lucia", "Pedro"};
        Integer[] edades = {10 , 12, 20};
        Almacen<String, Integer> almacen = new Almacen<>(nombres, edades);

        almacen.mostrar();

    }
}