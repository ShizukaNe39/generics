package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Par<String, Integer>[] pares = new Par[3];

        pares[0] = new Par<>("Juan", 20);
        pares[1] = new Par<>("Ana", 25);
        pares[2] = new Par<>("Luis", 30);

        for (Par<String, Integer> parAux : pares){
            parAux.mostrar();
        }

    }
}