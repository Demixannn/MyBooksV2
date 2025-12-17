import java.awt.*;
import java.awt.event.*;

public class HousePainter extends Frame {
  
  HousePainter(String title) {
        super(title);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
      HousePainter painter = new HousePainter("House Painter");
    }
    
    public void paint(Graphics painter) {
      
      painter.drawRect(20, 50, 350, 30);
      painter.drawRect(40, 80, 310, 250);
      painter.drawRect(80, 140, 60, 190);
      painter.drawRect(220, 140, 60, 60);
    }
}
