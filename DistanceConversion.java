// 6.9
import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a distance in feet and convert to meters
        System.out.print("Enter a distance in feet: ");
        double feet = input.nextDouble();
        double meters = footToMeter(feet);
        System.out.println(feet + " feet is " + meters + " meters.");

        // Prompt the user to enter a distance in meters and convert to feet
        System.out.print("Enter a distance in meters: ");
        double metersInput = input.nextDouble();
        double feetResult = meterToFoot(metersInput);
        System.out.println(metersInput + " meters is " + feetResult + " feet.");
    }

    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }
}