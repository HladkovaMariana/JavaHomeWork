package com.pb.hladkova.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива :");
        int size = in.nextInt();
        int array[] = new int[size];
        int count = 0;
        int temp;
        boolean sorted = false;
        System.out.println(" Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        System.out.print(" Введенный массив: ");
        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                count++;
            }
            System.out.print(" " + array[i]);
        }
        System.out.println(" Количество элементов массива: " + size);
        System.out.println(" Количетсво положительных элементов: " + count);
        System.out.println(" Сортируем... ");
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < size -1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        for (int i:array
        ) {
            System.out.print(" " +i);
        }

    }
}
