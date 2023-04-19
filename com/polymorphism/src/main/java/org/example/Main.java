package org.example;

public class Main {
    public static void main(String[] args) {

        Parent p = new subclass1();

        ((subclass1) p).Print2();

       double d = 10.5;
       int b = (int)d;

       Double e = 10.5;
       Integer i = 10;
        System.out.println(b);



        p = (Parent) new subclass1();
        p.Print();


        subclass1 s1 = new subclass1();
        s1.Print();
        s1.Print2();

        p = new subclass2();
        p.Print();
    }
}