package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 5));
        System.out.println(calculator.subtract(5, 5));
        System.out.println(calculator.multiply(5, 5));
        System.out.println(calculator.divide(5, 5));
        System.out.println("Michael Hu");
        logger.info("This is a info logger.");
        logger.error("This is an error logger.");
    }
}
