package com.company.homework6;

abstract class Animal {
    protected String name;
    static int animalCount = 0;
    Animal(String name){
        this.name = name;
        animalCount++;
    }
    abstract void run (int runDistance);
    abstract void swim (int swimDistance);

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
