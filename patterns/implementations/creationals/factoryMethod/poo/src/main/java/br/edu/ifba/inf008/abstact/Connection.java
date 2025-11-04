package br.edu.ifba.inf008.abstact;

public abstract class Connection {

    public void showType(){
        System.out.println(this.getClass().getSimpleName() + " connection created!");
    }

}
