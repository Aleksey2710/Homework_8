package com.skypro.homework_8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    public static void task1 () {
        System.out.println("Задача 1");

        int [] intBox = new int[3];
        intBox [0] = 1;
        intBox [1] = 2;
        intBox [2] = 3;

        double [] doubleBox = {1.57, 7.654, 9.986};

        boolean [] booleanBox = new boolean[9];

    }
    public static void task2 () {
        System.out.println("Задача 2");

        int [] intBox = new int[3];
        intBox [0] = 1;
        intBox [1] = 2;
        intBox [2] = 3;

        double [] doubleBox = {1.57, 7.654, 9.986};

        boolean [] booleanBox = new boolean[9];

        for (int i = 0; i < 3; i++) {
            if (i == intBox.length - 1) {
                System.out.println(intBox[i]);
                break;
            }
            System.out.print(intBox[i] + ", ");
        }
        for (int j = 0; j < doubleBox.length; j++) {
            if (j == doubleBox.length - 1) {
                System.out.println(doubleBox[j]);
                break;
            }
            System.out.print(doubleBox[j] + ", ");
        }
        for (int k = 0; k < booleanBox.length; k++) {
            if (k == booleanBox.length - 1) {
                System.out.println(booleanBox[k] + " " + k);
                break;
            }
            System.out.print(booleanBox[k] + " " + k + ", "); /*Так как в задании нужно вывести в консоль все элементы
                                                              массива в верном порядке, а потом наоборот,
                                                              то для удобства добавил счетчик "k"*/
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");

        int [] intBox = new int[3];
        intBox [0] = 1;
        intBox [1] = 2;
        intBox [2] = 3;

        double [] doubleBox = {1.57, 7.654, 9.986};

        boolean [] booleanBox = new boolean[9];

        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.println(intBox[i]);
                break;
            }
            System.out.print(intBox[i] + ", ");
        }
        for (int j = doubleBox.length - 1; j >= 0 ; j--) {
            if (j == 0) {
                System.out.println(doubleBox[j]);
                break;
            }
            System.out.print(doubleBox[j] + ", ");
        }
        for (int k = booleanBox.length - 1; k >= 0; k--) {
            if (k == 0) {
                System.out.println(booleanBox[k] + " " + k);
                break;
            }
            System.out.print(booleanBox[k] + " " + k + ", "); /*Так как в задании нужно вывести в консоль все элементы
                                                              массива в верном порядке, а потом наоборот,
                                                              то для удобства добавил счетчик "k"*/
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");

        int [] intBox = new int[3];
        intBox [0] = 1;
        intBox [1] = 2;
        intBox [2] = 3;

        for (int i = 0; i < intBox.length; i++) {
            if (intBox[i] % 2 != 0) {
                intBox[i]++;
            }
            if (i == intBox.length - 1) {
                System.out.println(intBox[i]);
                break;
            }
            System.out.print(intBox[i] + ", ");
        }
        System.out.println(Arrays.toString(intBox)); //Это для тренировки
    }
}
