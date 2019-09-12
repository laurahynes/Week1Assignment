
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {

    static Pen pen = new StandardPen(new SketchPadWindow(640, 640));

    public static void main(String[] args) {
        PenBar pb1, pb2, pb3, pb4;
        Scanner s = new Scanner(System.in);
        pb1 = new PenBar();
        pb2 = new PenBar();
        pb3 = new PenBar();
        pb4 = new PenBar();

        System.out.print("Enter the value of the first bar > ");
        pb1.width = s.nextInt();
        while (pb1.width <= 0) {
            System.out.print("Error. Value must be above 0. Enter new value > ");
            pb1.width = s.nextInt();

            if (pb1.width < 0) {
                break;
            }
        }

        System.out.print("Enter the value of the second bar > ");
        pb2.width = s.nextInt();
        while (pb2.width <= 0) {
            System.out.print("Error. Value must be above 0. Enter new value > ");
            pb2.width = s.nextInt();

            if (pb2.width < 0) {
                break;
            }
        }
        System.out.print("Enter the value of the third bar > ");
        pb3.width = s.nextInt();
        while (pb3.width <= 0) {
            System.out.print("Error. Value must be above 0. Enter new value > ");
            pb3.width = s.nextInt();

            if (pb3.width < 0) {
                break;
            }
        }
        System.out.print("Enter the value of the fourth bar > ");
        pb4.width = s.nextInt();
        while (pb4.width <= 0) {
            System.out.print("Error. Value must be above 0. Enter new value > ");
            pb4.width = s.nextInt();

            if (pb4.width < 0) {
                break;
            }
        }

        makeBar(pb1, -350, 200, pb1.width, Color.blue);
        makeBar(pb2, -350, 100, pb2.width, Color.green);
        makeBar(pb3, -350, 0, pb3.width, Color.red);
        makeBar(pb4, -350, -100, pb4.width, Color.orange);
    }

    public static void makeBar(PenBar pb, int x, int y, int w, Color c) {
        pb.xloc = x;
        pb.yloc = y;
        pb.width = w;
        pb.col = c;
        pb.draw(pen);
    }
}
