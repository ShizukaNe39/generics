package org.example;

public class Almacen <T, U> {
    private T[] vector1;
    private U[] vector2;

    public Almacen(T[] vector1, U[] vector2){
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

    public void mostrar(){
        for (int i = 0; i < vector1.length; i++){
            System.out.println(vector1[i] + " - " + vector2[i]);
        }
    }
}
