package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

import javax.naming.Name;
import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.nextLine();
        in.close();

        if("Вася".equals(name))
        {
            System.out.println("Привет!");
            System.out.println("Я так долго тебя ждал");
            return;
        }
        if("Анастасия".equals(name))
        {
            System.out.println("Я так долго тебя ждал");
            return;
        }

        if (name.equals(name) !="Анастасия".equals(name) || name.equals(name) != "Вася".equals(name))
        {
            System.out.println("Добрый день, а вы кто?");
            return;
        }
    }
}

