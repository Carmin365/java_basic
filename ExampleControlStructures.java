public class ExampleControlStructures {
    public static void main(String[] args) {
        int number = 10;

        if (number > 5) {
            System.out.println("The number is greater than 5.");
        } else {
            System.out.println("The number is less than or equal to 5.");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Counter: " + i);
        }

        int counter = 0;
        while (counter < 3) {
            System.out.println("Counter (while): " + counter);
            counter++;
        }
    }
}
