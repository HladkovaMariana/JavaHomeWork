package com.pb.hladkova.hw3;
import java.util.Scanner;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
            System.out.println(" Если тебе это не нужно, пиши - exit ");
            System.out.println(" Я загадала число от 1 до 100, угадай его ");
            int attempt1 = 100;
            int attempt2 = 0;
            int number = (int)(Math.random()*10+1);
            Scanner in = new Scanner(System.in);
            while (attempt2 <= attempt1) {
                attempt2++;
                System.out.println(" Попытка " + attempt2 + " : ");
                String value = in.next();
                if (value.equals("exit"))
                    break;

                int strToNum = Integer.parseInt(value);
                if (strToNum > number) {

                    System.out.println(" Ваше число больше загаданного, попробуйте еще ");
                } else if (strToNum < number) {
                    System.out.println(" Ваше число меньше загаданного, попробуйте еще  ");
                } else {
                    System.out.println(" Поздравляем, Вы угадали с " + attempt2 + " попытки! ");
                    break;
                }
            } System.out.println("Конец игры!");
        }
    }