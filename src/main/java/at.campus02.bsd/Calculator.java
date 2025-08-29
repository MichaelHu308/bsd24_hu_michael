package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2){
        logger.debug(number1 + " AND " + number2);
        return number1 + number2;
    }
    public double subtract(double number1, double number2){
        logger.debug(number1 + " AND " + number2);
        return number1 - number2;
    }
    public double divide(double number1, double number2){
        logger.debug(number1 + " AND " + number2);
        if (number2 == 0) {
            logger.error("Division by zero");
        }
        return number1 / number2;
    }
    public double multiply(double number1, double number2){
        logger.debug(number1 + " AND " + number2);
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
