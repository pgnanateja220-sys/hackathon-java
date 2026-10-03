import java.util.Scanner;

public class WasteCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading waste data from the user
        System.out.print("Enter waste collected at Collection Point 1 (in kg): ");
        double point1 = scanner.nextDouble();

        System.out.print("Enter waste collected at Collection Point 2 (in kg): ");
        double point2 = scanner.nextDouble();

        // Calling the method to calculate the total
        double totalWaste = calculateTotalWaste(point1, point2);

        // Displaying the result
        System.out.println("Total waste collected: " + totalWaste + " kg");

        scanner.close();
    }

    /**
     * Method to calculate the total waste from two collection points.
     */
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }
}
