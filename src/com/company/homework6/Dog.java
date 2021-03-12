package com.company.homework6;

public class Dog extends Animal {
    static int countDog = 0;
    private final int DOG_RUN_LIMIT = 500;
    private final int DOG_SWIM_LIMIT = 10;
    public Dog(String name) {
        super(name);
        countDog++;
    }
    public void run(int runDistance){
        if(runDistance > DOG_RUN_LIMIT || runDistance < 0) {
            System.out.println("недопустимое значение");
        }
        else{
            System.out.println(name + " пробежал " + runDistance + "м");
        }
    }
    public void swim(int swimDistance){
        if(swimDistance > DOG_SWIM_LIMIT || swimDistance < 0) System.out.println("недопустимое значение");
        else System.out.println(name + " проплыл " + swimDistance + "м");
    }
}
