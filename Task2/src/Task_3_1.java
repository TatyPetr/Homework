import java.util.Scanner;

 public class Task_3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Количество элементов массива:");
        int a = in.nextInt ();
        int [] myArray  = new int [a];

        System.out.println("Введите элементы массива:");
        int i = 0;
        do {
            myArray [i] = in.nextInt();
            i++;
        }
        while (i != a);
        System.out.print("Массив:\n");
        i = 0;
        do {
            System.out.println(myArray [i] + " ");
            i ++;
        }
        while (i!= a);
}
    { Scanner in = new Scanner(System.in);
    System.out.print("Количество элементов массива:");
    int a = in.nextInt ();
    int [] myArray  = new int [a];

    System.out.println("Введите элементы массива:");
    int i = 0;
        while (i != a) {
            myArray [i] = in.nextInt();
            i++;
        }
        System.out.print("Массив:\n");
        i = 0;
        while (i!= a){
        System.out.println(myArray [i] + " ");
        i ++;
    }

}}