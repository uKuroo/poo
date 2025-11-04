package br.edu.ifba.inf008;

import br.edu.ifba.inf008.concrets.Email;
import br.edu.ifba.inf008.concrets.User;

public class App 
{
    public static void run1(){
        User user1 = new User("Gabriel", new Email("gabriel@gmail.com"), 19);
        User user2 = (User) user1.clone();

        System.out.println(user1);
        System.out.println(user2);

        System.out.println(user1.verifyEmail());
    }
    
    public static void main(String[] args)
    {
        run1();
    }
}
