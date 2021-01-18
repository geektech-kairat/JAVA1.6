package com.company;

public class Animal {
    private  int age;
    private String color, bread;

    public Animal() {
    }

    public Animal(int age, String color, String bread) {
        this.age = age;
        this.color = color;
        this.bread = bread;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;


    }
    public String getInfo(){
        return age + " " + color + " " + bread;
    }
}