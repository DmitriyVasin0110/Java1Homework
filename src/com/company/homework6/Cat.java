package com.company.homework6;

public class Cat extends Animal {
    static int catCount = 0;
    private final int CAT_RUN_LIMIT = 150;
    public Cat(String name){
        super(name);
        catCount++;
    }
    public void run(int runDistance) {
        if(runDistance > CAT_RUN_LIMIT || runDistance < 0) {
            System.out.println("недопустимое значение");
        }
        else {
            System.out.println(name + " пробежал " + runDistance + "м");
        }
    }
    public void swim(int swimDistance) {
        System.out.println("Кот не умеет плавать");
    }
}
