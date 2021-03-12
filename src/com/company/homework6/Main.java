package com.company.homework6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Снежок");
        Dog dog1 = new Dog("Рекс");
        cat1.run(149);
        cat1.swim(100);
        dog1.run(234);
        dog1.swim(3);
        System.out.println("Количество созданных котов: " + Cat.catCount);
        System.out.println("Количество созданных собак: " + Dog.countDog);
        System.out.println("Количество созданных животных: " + Animal.animalCount);
    }
}
