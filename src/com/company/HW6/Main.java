package com.company.HW6;

public class Main {
    public static void main(String[] args) {
    Cat cat1 = new Cat("Барсик", 10, 200 );
    Dog dog1 = new Dog("Рекс", 15, 250);
    cat1.run(198);
    dog1.run(234);
    cat1.swim(3);
    dog1.swim(23);
    System.out.println("Количество созданных котов: " + Cat.countCat);
    System.out.println("Количество созданных собак: " + Dog.countDog);
    System.out.println("Количество созданных животных: " + Animal.countAnimal);
    }
}
