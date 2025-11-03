package br.edu.ifba.inf008.abstact;

public abstract class Vehicle {
    public void showType(){
        System.out.println("Type: " + this.getClass().getSimpleName());
    }
}
