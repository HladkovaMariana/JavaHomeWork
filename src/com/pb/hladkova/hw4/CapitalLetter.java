package com.pb.hladkova.hw4;
import java.util.Scanner;

public class CapitalLetter {
    static Character function(Character firstLetter) {
        Character upperLetter = Character.toUpperCase(firstLetter);
        return upperLetter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите, пожалуйста, строку");
        String str = in.nextLine();

        char[] chArray = str.toCharArray();

        chArray[0] = Character.toUpperCase(chArray[0]);
        for (int i = 0; i < str.length(); i++) {
            if (chArray[i] == ' ') {
                Character modifyLetter = function(chArray[i + 1]);
                chArray[i + 1] = modifyLetter;
            }
            System.out.print(chArray[i]);
        }
    }
}