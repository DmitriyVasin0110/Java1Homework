package com.company.HW6;

public class Animal {
    protected String name;
    protected int swimLimit;
    protected int runLimit;
    static int countAnimal = 0;

    Animal(String name, int swimLimit, int runLimit){
        this.name = name;
        this.swimLimit = swimLimit;
        this.runLimit = runLimit;
        countAnimal++;
    }
    public void swim(int swimDistance){
        if (swimDistance > swimLimit || swimDistance < 0) {
            System.out.println("Недопустимое значение");
        }
            else {
                System.out.println(name + " проплыл " + swimDistance + "м");
            }
    }
    public void run(int runDistance){
        if (runDistance > runLimit || runDistance < 0) {
            System.out.println("Недопустимое значение");
        }
        else {
            System.out.println(name + " проплыл " + runDistance + "м");
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSwimLimit() {
        return swimLimit;
    }
    public void setSwimLimit(int swimLimit) {
        this.swimLimit = swimLimit;
    }
    public int getRunLimit() {
        return runLimit;
    }
    public void setRunLimit(int runLimit) {
        this.runLimit = runLimit;
    }
}
