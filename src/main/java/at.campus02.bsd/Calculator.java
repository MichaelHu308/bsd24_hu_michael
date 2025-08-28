package at.campus02.bsd;

public class Calculator {

    public double add(double number1, double number2){
        return number1 + number2;
    }
    public double subtract(double number1, double number2){
        return number1 - number2;
    }
    public double divide(double number1, double number2){
        return number1 / number2;
    }
    public double multiply(double number1, double number2){
        return number1 * number2;
    }

    public int factorial(int number) {
        if (number < 0) {
            return 0;
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
