public class CalculatorWithOperatorMain {
  //  4.1 + 15 * 7 + (28 / 5) ^ 2
  public static void main(String[] args) {
      CalculatorWithOperator old = new CalculatorWithOperator();
      double division = old.division(28, 5);
      double pow = old.pow(division, 2);
      double multiplication = old.multiplication(15,7);
      double addition = old.addition(4.1, multiplication);
      double addition2 = old.addition(addition, pow);
      System.out.printf("Результат: %.2f \n", addition2);
  }
}
