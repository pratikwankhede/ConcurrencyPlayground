package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        UserRepository ur = new UserRepository();
        ur.add(new User(1,"A","ash"));

        Thread thread1 = new Thread(() -> {

            for(int i=0;i<200;i++) ur.increment(1);
        });
        thread1.start();

        for(int i=0;i<200;i++) ur.increment(1);
        System.out.println(ur.get(1).param);



    }
}