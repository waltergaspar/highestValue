import java.util.Locale;
import java.util.Scanner;

public class highestValue {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers, valuePosition;

        // number of numbers to be entered
        System.out.print("How many numbers you will enter? ");
        numberOfNumbers = scanner.nextInt();
        double[] numbers = new double[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextDouble();
        }

        // highest value verification
        double highestValue = numbers[0];
        valuePosition = 0;
        for (int i = 0; i < numberOfNumbers; i++) {
            if(numbers[i] > highestValue){
                highestValue = numbers[i];
                valuePosition = i;
            }
        }
        System.out.println("Highest value: " + highestValue);
        System.out.println("Highest value position: " + valuePosition);
    }
}
