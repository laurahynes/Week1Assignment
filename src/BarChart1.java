
import hsa.Console;
import java.awt.Color;

public class BarChart1 {

    public static void main(String[] args) {
        Console c = new Console();
        int h1, h2, h3, h4;
        // get heights
        c.print("Enter the height of the first bar > ");
        h1 = c.readInt();
        while (h1 <= 0) {
            c.print("Error. Height must be above 0. Enter new height > ");
            h1 = c.readInt();
            if (h1 > 0) {
                break;
            }
        }
        c.print("Enter the height of the second bar > ");
        h2 = c.readInt();
        while (h2 <= 0) {
            c.print("Error. Height must be above 0. Enter new height > ");
            h2 = c.readInt();
            if (h2 > 0) {
                break;
            }
        }
        c.print("Enter the height of the third bar > ");
        h3 = c.readInt();
        while (h3 <= 0) {
            c.print("Error. Height must be above 0. Enter new height > ");
            h3 = c.readInt();
            if (h3 > 0) {
                break;
            }
        }
        c.print("Enter the height of the fourth bar > ");
        h4 = c.readInt();
        while (h4 <= 0) {
            c.print("Error. Height must be above 0. Enter new height > ");
            h4 = c.readInt();
            if (h4 > 0) {
                break;
            }
        }
        c.clear();

        //1st bar
        c.setColor(Color.red);
        c.fillRect(100, 500 - h1, 50, h1);
        c.drawString("Value: " + h1, 100, 500 - h1 - 20);

        //2nd bar        
        c.setColor(Color.blue);
        c.fillRect(200, 500 - h2, 50, h2);
        c.drawString("Value: " + h2, 200, 500 - h2 - 20);

        //3rd bar        
        c.setColor(Color.green);
        c.fillRect(300, 500 - h3, 50, h3);
        c.drawString("Value: " + h3, 300, 500 - h3 - 20);

        //4th bar        
        c.setColor(Color.orange);
        c.fillRect(400, 500 - h4, 50, h4);
        c.drawString("Value: " + h4, 400, 500 - h4 - 20);
    }

}
