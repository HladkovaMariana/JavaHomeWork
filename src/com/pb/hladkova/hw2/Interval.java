package com.pb.hladkova.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("введите число: ");
        int userNumb = in.nextInt();

        if (userNumb >= 0 && userNumb <= 14) {
            System.out.println("чиcло в промежутке 0-14");
            in.close();
        } else if (userNumb >= 15 && userNumb <= 35) {
            System.out.println("чиcло в промежутке 15-35");
            in.close();
        } else if (userNumb >= 36 && userNumb <= 50) {
            System.out.println("чиcло в промежутке 36-50");
            in.close();
        } else if (userNumb >= 51 && userNumb <= 100) {
            System.out.println("чиcло в промежутке 51-100");
            in.close();
        } else {
            System.out.println("число не входит ни в одни промежуток");
        }
    }
}
