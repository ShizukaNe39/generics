package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer[] mivector = {3,2,1};
        VectorGenerico<Integer> vectorNumeros = new VectorGenerico<>(mivector);

        vectorNumeros.mostrar();
    }
}