package org.example;

public class Par<T, U>{
    private T primero;
    private U segundo;

    public Par (T primero, U segundo){
        this.primero = primero;
        this.segundo = segundo;
    }

    public void mostrar(){
        System.out.println("Primero: " + primero);
        System.out.println("Segundo: " + segundo);
    }
}
