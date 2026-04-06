 import java.util.Scanner;
public class discount  {
    public static void main(String[] args) {

        /*double cartValue = 3000; // change value here

        double discount = 0;

        if (cartValue > 5000) {
            discount = cartValue * 0.20;
        } else if (cartValue > 2000) {
            discount = cartValue * 0.10;
        } else {
            discount = 0;
        }

        double finalAmount = cartValue - discount;

        System.out.println("Cart Value: " + cartValue);
        System.out.println("Discount: " + discount);
        System.out.println("Final Payable Amount: " + finalAmount);*/
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter mileage (km per liter): ");
        double mileage = sc.nextDouble();

        System.out.print("Enter fuel price (per liter): ");
        double fuelPrice = sc.nextDouble();

        // Calculation
        double fuelNeeded = distance / mileage;
        double totalCost = fuelNeeded * fuelPrice;

        // Output
        System.out.println("Fuel needed: " + fuelNeeded + " liters");
        System.out.println("Total fuel cost: ₹" + totalCost);

        sc.close();
    }
}