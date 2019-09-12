import TurtleGraphics.Pen;
import java.awt.Color;

public class PenBar {
    int xloc, yloc, width;
    Color col;
    
    public void draw(Pen p){
       p.up();
       p.move(xloc,yloc);
       p.down();
       p.setWidth(50);
       p.setColor(col);
       p.setDirection(0);
       p.move(width);
       p.up();
       p.move(50);
       p.drawString("Value: " + width);
    }
}
