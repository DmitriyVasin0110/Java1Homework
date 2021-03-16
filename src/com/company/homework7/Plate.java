package com.company.homework7;

public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
    public void info(){
        System.out.println("В тарелке " + food + " еды");
    }
    public void decreaseFood(int n){
        food-=n;
    }
    public void addFood(int f){
        food+=f;
    }
}
