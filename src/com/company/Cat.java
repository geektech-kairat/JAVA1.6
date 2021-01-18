package com.company;

public class Cat  extends Animal{
    private int lives;
    public Cat(int age, String color, String bread, int lives){
        super(age, color , bread);
        this.lives = lives;

    }

    public int getLives() {
        return lives;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + lives;
    }
}
