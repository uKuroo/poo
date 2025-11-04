package br.edu.ifba.inf008.concrets;

import br.edu.ifba.inf008.interfaces.Clonable;

public class User implements Clonable{
    private String Name;
    private Email email;
    private int age;

    public User(String name, Email email, int age){
        this.Name = name;
        this.email = email;
        this.age = age;
    }

    private User(User user){
        this.Name = user.Name;
        this.email = (Email) user.email.clone();
        this.age = user.age;
    }

    public boolean verifyEmail(){
        return this.email.verifyEmail();
    }

    @Override
    public Clonable clone() {
        return new User(this);
    }

    @Override
    public String toString() {
        return "User [Name=" + Name + ", email=" + email + ", age=" + age + "]";
    }

}
