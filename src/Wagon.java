import hsa.Console;
import java.awt.Color;

public class Wagon {

    public static void main(String[] args) {
        Console c = new Console();
        //sky
        c.setColor(Color.cyan);
        c.fillRect(0, 0, 700, 700);
        //grass
        c.setColor(Color.green);
        c.fillRect(0, 400, 700, 700);
        //red box        
        c.setColor(Color.red);
        c.fillRect(150, 300, 350, 75);
        //wheels
        c.setColor(Color.black);
        c.fillOval(200, 350, 50, 50);
        c.fillOval(400, 350, 50, 50);
        //sun
        c.setColor(Color.yellow);
        c.fillOval(500, 50, 100, 100);
        //handle
        c.setColor(Color.gray);
        c.drawLine(50, 200, 150, 300);
                
       
        
    }
    
}
