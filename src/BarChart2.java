
import hsa.Console;
import java.awt.Color;

public class BarChart2 {

    public static void main(String[] args) {
        Console c = new Console();
        Bar b1 = new Bar();
        Bar b2 = new Bar();
        Bar b3 = new Bar();
        Bar b4 = new Bar();

        //ask for heights of bars
        c.print("Enter the height of the first bar > ");
        b1.height = c.readInt();
        while (b1.height <= 0) {
            c.print("Error. Height must be above 0. Enter new height > ");
            b1.height = c.readInt();
            if (b1.height > 0) {
                break;
            }
        }
        c.print("Enter the height of the second bar > ");
        b2.height = c.readInt();
        while (b2.height <= 0) {
            c.print("Error. Height must be above 0. Enter new height > ");
            b2.height = c.readInt();
            if (b2.height > 0) {
                break;
            }
        }
        c.print("Enter the height of the third bar > ");
        b3.height = c.readInt();
        while (b2.height <= 0) {
            c.print("Error. Height must be above 0. Enter new height > ");
            b2.height = c.readInt();
            if (b2.height > 0) {
                break;
            }
        }
        c.print("Enter the height of the fourth bar > ");
        b4.height = c.readInt();
        while (b4.height <= 0) {
            c.print("Error. Height must be above 0. Enter new height > ");
            b4.height = c.readInt();
            if (b4.height > 0) {
                break;
            }
        }
        c.clear();

        //locs and colours
        b1.xloc = 150;
        b1.col = Color.red;

        b2.xloc = 250;
        b2.col = Color.blue;

        b3.xloc = 350;
        b3.col = Color.green;

        b4.xloc = 450;
        b4.col = Color.orange;

        //draw the bars
        b1.draw(c);
        b2.draw(c);
        b3.draw(c);
        b4.draw(c);
    }

}
