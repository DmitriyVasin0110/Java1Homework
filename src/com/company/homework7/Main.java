package com.company.homework7;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Plate plate1 = new Plate(50);

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Том", 20);
        cat[1] = new Cat("Абрикос", 12);
        cat[2] = new Cat("Пират", 13);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate1);
            if (cat[i].isSatiety()){
                System.out.println("Кот " + cat[i].getName() + " сыт");
            }
            else {
               System.out.println("Кот " + cat[i].getName() + " голоден");
            }
        }
        plate1.info();
        System.out.println("Cколько еды добавить в тарелку?");
        int num = scanner.nextInt();
        plate1.addFood(num);
        plate1.info();
    }
}
