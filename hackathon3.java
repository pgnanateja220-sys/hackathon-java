import java.util.Scanner;

public class WasteCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the waste collected at Point 1 (in kg): ");
        double point1 = scanner.nextDouble();

        System.out.print("Enter the waste collected at Point 2 (in kg): ");
        double point2 = scanner.nextDouble();

        
        double totalWaste = calculateTotalWaste(point1, point2);

        
        System.out.println("----------------------------------------");
        System.out.println("Total waste collected: " + totalWaste + " kg");
        System.out.println("----------------------------------------");

        scanner.close();
    }

    /**
     * Method to calculate the total waste from two collection points.
     * 
     * @param point1Waste Waste from the first point
     * @param point2Waste Waste from the second point
     * @return The sum of waste from both points
     */
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }
}
