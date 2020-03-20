package com.company;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.nextLine();
        in.close();

        if ("Вася".equals(name))
        {
            System.out.println("Привет!");
            System.out.println("Я так долго тебя ждал");
            return;
        }
        else if ("Анастасия".equals(name))
        {
            System.out.println("Я так долго тебя ждал");
            return;
        }
        else {
            System.out.println("Добрый день, а вы кто?");
            return;
        }
    }
}


