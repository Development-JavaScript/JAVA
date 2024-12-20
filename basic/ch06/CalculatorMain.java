package ch06;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.powerOn();

        int result1 = calculator.plues(5, 6);
        System.out.println("result1: " + result1);
        int result2 = calculator.divide(10, 4);
        System.out.println("result2: " + result2);

        calculator.powerOff();
    }
}
