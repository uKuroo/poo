package br.edu.ifba.inf008.concrets;

import br.edu.ifba.inf008.interfaces.Clonable;

public class Email implements Clonable{
    private String email;

    private Email(Email email){
        this.email = email.email;
    }

    public Email(String email){
        this.email = email;
    }

    public boolean verifyEmail(){
        return this.email.contains("@");
    }

    @Override
    public Clonable clone() {
        return new Email(this);
    }

    @Override
    public String toString(){
        return this.email; 
    }
}
