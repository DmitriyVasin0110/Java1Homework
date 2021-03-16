package com.company.HW6;

public class Dog extends Animal{
    static int countDog = 0;
    Dog(String name, int swimLimit, int runLimit){
        super(name, swimLimit, runLimit);
        countDog++;
    }
}
