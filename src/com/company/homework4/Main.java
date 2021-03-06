package com.company.homework4;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static char[][] map;
    public static final int SIZE = 3;
    //public static final int DOTS_TO_WIN = 3;
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static final char DOT_EMPTY = '•';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_0)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y :");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер выбрал точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_0;
    }

    public static boolean checkWin(char symb) {
        int countX; //количество символов в строке
        int countY; //количество символов в столбце
        int diagonalMain = 0;
        int diagonalSide = 0;
        for (int i = 0; i < SIZE; i++) {
            countX = 0;
            countY = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) countX++;
                if (map[j][i] == symb) countY++;
            }
            if (countX == SIZE) return true;
            if (countY == SIZE) return true;

            if (map[i][i] == symb) diagonalMain++;
            if (diagonalMain == SIZE) return true;
            if (map[i][SIZE - 1 - i] == symb) diagonalSide++;
            if (diagonalSide == SIZE) return true;
        }
        return false;
    }
}



