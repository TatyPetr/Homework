package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое число от 1 до 10:");
        int count = 0;

        do {
            try {
                int number = Integer.parseInt (scan.nextLine());
                if (number < 1 || number > 10){
                    throw new InputMismatchException ();
                }
            } catch (InputMismatchException e) {
                count++;
                System.out.println("Повторите попытку");
            } catch (NumberFormatException e) {
                count++;
                System.out.println("Tекст вводить нельзя. Повторите попытку");
            }}
            while (count < 3) ;
        }
    }



