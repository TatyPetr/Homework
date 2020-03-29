public class Task_2_3 {
    public static void main(String[] args) {
        int number = 10;
        int mult = 0;

        while (mult != 0){

            mult *= number % 10;
            number/=10;
            mult = mult * number;
        }
        System.out.println(mult + " ");
}}