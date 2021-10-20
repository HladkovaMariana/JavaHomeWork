package com.pb.hladkova.ts;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        System.out.println(" Если хочешь закончить введи 33 ");
        System.out.println(" Я загад число от 1 до 10, угадай его ");
        int attempt1 = 10;
        int attempt2 = 0;
        int number = (int) (Math.random() * 10 + 1);
        Scanner in = new Scanner(System.in);
        while (attempt2 <= attempt1) {
            attempt2++;
            System.out.println(" Попытка " + attempt2 + " : ");
            int value = in.nextInt();
            if (value == 33)
                break;
            if (value > number) {
                System.out.println(" Ваше число больше загаданного ");
            } else if (value < number) {
                System.out.println(" Ваше число меньше загаданного ");
            } else {
                System.out.println(" Поздравляем, Вы угадали с " + attempt2 + " попытки ");
                break;
            }
            System.out.println(" Конец игры! ");
        }
    }
}