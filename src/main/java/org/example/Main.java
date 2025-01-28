package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        UserRepository ur = new UserRepository();
        ur.add(new User(1,"A","ash"));

        Thread thread1 = new Thread(() -> {

            for(int i=0;i<200;i++) ur.increment(1);
        });
        Thread thread2 = new Thread(() -> {

            for(int i=0;i<200;i++) ur.increment(1);
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();



        System.out.println(ur.get(1).param);



    }
}