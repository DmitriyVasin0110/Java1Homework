package com.company.homework5;

public class Main {

    public static void main(String[] args) {
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Ivanov Ivan", "Engineer", "iviv@mail.ru", "89211111111", 30000, 30);
        empArr[1] = new Employee("Vasin Vasya", "Doctor", "vasvas@mail.ru", "89212222222", 25000, 34);
        empArr[2] = new Employee("Sidorova Irina", "Teacher", "sidirina@gmail.com", "89213333333", 27000, 42);
        empArr[3] = new Employee("Petrova Maria", "Designer", "mariapetr@mail.ru", "89214444444", 40000, 25);
        empArr[4] = new Employee("Smirnov Egor", "Driver", "smirneg@mail.ru", "89215555555", 32000, 54);

        for (int i = 0; i < empArr.length; i++) {
            if (empArr[i].getAge()>40){
                empArr[i].outputInfo();
            }
            System.out.println();
        }
    }
}
