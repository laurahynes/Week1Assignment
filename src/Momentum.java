
import java.util.Scanner;

public class Momentum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vel, mass, m, sec;
        System.out.print("Enter the objects mass(kg): ");
        mass = scan.nextDouble();
        while (mass <= 0) {
            System.out.print("Error. Mass must be above 0kg. Enter a new mass > ");
            mass = scan.nextDouble();
            if (mass > 0) {
                break;
            }
        }
        System.out.print("Enter how far the object traveled(meters): ");
        m = scan.nextDouble();
        while (m <= 0) {
            System.out.print("Error. Distance must be above 0m. Enter a new distance > ");
            m = scan.nextDouble();
            if (m > 0) {
                break;
            }
        }
        System.out.print("Enter how fast the object traveled(seconds): ");
        sec = scan.nextDouble();
        while (sec <= 0) {
            System.out.print("Error. Time must be above 0 seconds. Enter a new time > ");
            sec = scan.nextDouble();
            if (sec > 0) {
                break;
            }
        }
        vel = m / sec;
        System.out.format("The objects velocity is %.2f m/s. \n", vel);
        System.out.format("The objects momentum is %.2f kg*m/s.\n", mass * vel);
        System.out.println("hi");
    }

}
