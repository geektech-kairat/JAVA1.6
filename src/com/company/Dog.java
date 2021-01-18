package com.company;

public class Dog extends Animal {
    private String commands;
    public Dog (int age, String color, String breed, String commands){
        super(age, color, breed);
        this.commands = commands;

    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;

    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + commands;
    }
}
