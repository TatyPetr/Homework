package com.company;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.nextLine();
        in.close();

        switch (name)
        {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я так долго тебя ждал");
                break;
            case "Анастасия":
                System.out.println("Я так долго тебя ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
