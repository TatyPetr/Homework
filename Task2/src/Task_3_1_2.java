import java.util.Scanner;

public class Task_3_1_2 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Количество элементов массива:");
            int a = in.nextInt();
            int[] myArray = new int[a];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i != a; i++) {
                myArray[i] = in.nextInt();
            }
            System.out.print("Массив:\n");
            for (int i = 0; i != a; i++) {
                System.out.println(myArray[i] + " ");
            }
        }

    public static void Foreach ()
        { Scanner in = new Scanner(System.in);
            System.out.print("Количество элементов массива:");
            int a = in.nextInt ();
            int [] myArray  = new int [a];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i != a; i++) {
                myArray[i] = in.nextInt();
            }
            System.out.print("Массив:\n");
            for (int num: myArray){
                System.out.println(num + " " );
            }
    }
}
