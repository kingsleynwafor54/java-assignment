package TDD;

public class Calculator {

    public  int  difference(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) ;
        {
            return firstNumber - secondNumber;
        }
    }
    public int add(int firstNumber, int secondNumber) {
        int add = firstNumber + secondNumber;
        return add;
    }

    public int multiply(int firstNumber, int secondNumber) {
        int multiply = firstNumber * secondNumber;
        return multiply;
    }

    public double divide(int numerator, int denominator) {
        if (denominator == 0) {
            return 0;
        }


        return numerator / (denominator * 1.0);

    }
}