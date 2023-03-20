package phase_1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


public class SolarSystem extends JPanel {
    
    public void paintComponent(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        Line2D.Double diagonalLine = new Line2D.Double(0, 0, 800,800);
        g2D.draw(diagonalLine);
    }
}
