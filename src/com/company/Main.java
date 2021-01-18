package com.company;

public class Main {

    public static void main(String[] args) {
	Cat cat = new Cat(25,"red" , "bob", 24);
        System.out.println(cat.getInfo());
        Dog dog = new Dog(25,"bleak", "pit", "ura");
        System.out.println(dog.getInfo());
    }
}
