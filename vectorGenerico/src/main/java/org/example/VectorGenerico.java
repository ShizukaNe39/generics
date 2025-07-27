package org.example;

public class VectorGenerico<T> {
    private T[] vectorG;

    public VectorGenerico(T[] vectorG){
        this.vectorG=vectorG;
    }

    public void mostrar(){
        for (T aux : vectorG){
            System.out.println(aux);
        }
    }
}
