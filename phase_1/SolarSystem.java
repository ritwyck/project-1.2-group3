package phase_1;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class SolarSystem extends JPanel 
{
    public void paintComponent(Graphics g) 
    {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(1));
        g.setColor(Color.WHITE);

        Line2D.Double diagonalLine = new Line2D.Double(1400, 0, 0,750);
        Line2D.Double diagonalLine1 = new Line2D.Double(0, 0, 1400,750);

        for(int i = 0; i < 300; i++)
        {
            double x = Math.random()*1400;
            double y = Math.random()*750;
            Line2D.Double star = new Line2D.Double(x, y, x+1,y);
            g2D.draw(star);
        }
       
        g2D.draw(diagonalLine);
        g2D.draw(diagonalLine1);
    }
}
