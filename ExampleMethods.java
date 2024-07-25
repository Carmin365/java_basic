public class ExampleMethods {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(5, 3);
        System.out.println("Result: " + result);
    }
}

class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
}

