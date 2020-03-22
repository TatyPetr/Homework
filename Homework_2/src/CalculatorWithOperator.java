public class CalculatorWithOperator<b> {

    public double a;
    public double b;

    public double division(double a, double b){
            double x;
            x = a / b;
            return x;
        }

        public double multiplication(double a, double b){
            double x;
            x = a * b;
            return x;
        }

        public double addition(double a, double b){
            double x;
            x = a + b;
            return x;
        }

        public double substraction (double a, double b)
        {
            double x;
            x = a - b;
            return x;
        }
        public double abs(double a) {
            double x;
            x = Math.abs(a);
            return x;
        }
        public double sqrt(double b) {
            double x;
            x = Math.sqrt(b);
            return x;
        }

    public double pow(double a, double b) {
        double x;
        x = Math.pow(a, b);
        return x;
    }
    }


