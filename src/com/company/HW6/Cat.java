package com.company.HW6;

public class Cat extends Animal {
    static int countCat = 0;
    Cat(String name, int swimLimit, int runLimit){
        super(name, swimLimit, runLimit);
        countCat++;
    }
    @Override
    public  void swim(int swimDistance){
        System.out.println("Коты не умеют плавать");
    }
}
