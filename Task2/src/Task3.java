public class Task3 {
    static int CalculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result= result*n;
        }
        return result;
    }

    public static void main(String[] args) {
    System.out.println(CalculateFactorial(10));
}
}
