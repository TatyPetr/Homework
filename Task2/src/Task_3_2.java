import java.util.Scanner;

public class Task_3_2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Количество элементов массива:");
            int a = in.nextInt();
            int[] myArray = new int[a];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = in.nextInt();
            }
            System.out.print("Каждый элемент второй:\n");
            for (int i = 0; i < myArray.length; i+=2) {
                System.out.println(myArray[i] + " ");
            }
        }
    }