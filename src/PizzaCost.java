
import java.util.Scanner;

public class PizzaCost {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double BASE = 0.50, HEAT = 0.75, LABOUR = 1.50, TOP = 0.75;
        double size, toppings;
        double cost = BASE + HEAT + LABOUR;
        System.out.print("What is the size of your pizza(in)? > ");
        size = s.nextDouble();
        while (size <= 0) {
            System.out.print("Error. Pizza size must be larger than 0. Enter new size > ");
            size = s.nextDouble();
            if (size > 0) {
                break;
            }
        }
        cost += size * cost;
        System.out.print("How many toppings would you like? > ");
        toppings = s.nextDouble();
        cost += toppings * TOP;
        System.out.format("Your pizza will cost $%.2f.\n", cost);
    }

}
