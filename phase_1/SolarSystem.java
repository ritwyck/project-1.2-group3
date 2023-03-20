package phase_1;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.security.spec.EllipticCurve;

public class SolarSystem extends JPanel 
{
    public void paintComponent(Graphics g) 
    {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke((float)1));
        g.setColor(Color.WHITE);

        for(int i = 0; i < 50; i++)
        {
            g2D.setStroke(new BasicStroke((float) (Math.random()*0.2)));
            g.setColor(new Color(((int)Math.round(Math.random()*100000))));
            double x = Math.random()*740;
            double y = Math.random()*740;
            if((x < 340 || x > 400) || (y < 340 || y > 400))
            {
                Line2D.Double star = new Line2D.Double(x, y, x, y);
                g2D.draw(star);
            }
        }

        for(int i = 0; i < 250; i++)
        {
            g2D.setStroke(new BasicStroke((float) (Math.random()*0.2)));
            g.setColor(Color.WHITE);
            double x = Math.random()*740;
            double y = Math.random()*740;
            if((x < 340 || x > 400) || (y < 340 || y > 400))
            {
                Line2D.Double star = new Line2D.Double(x, y, x, y);
                g2D.draw(star);
            }
        }

        // 1px = 3513513.51351km  
        // furtherest distance in a 370px radius = 1,300,000,000km
        // approximate distance to titan = 1,250,000,000km or 355.76923077px 
        
        g2D.setStroke(new BasicStroke((float) 0.3959056923));
        g.setColor(Color.ORANGE);
        Line2D.Double sun = new Line2D.Double(370, 370, 370,370);
        g2D.draw(sun);

        g2D.setStroke(new BasicStroke(1));
        g.setColor(Color.GREEN);
        Ellipse2D.Double venusOrbit = new Ellipse2D.Double(370-29.6, 370-29.6, 29.6*2, 29.6*2);
        g2D.draw(venusOrbit);

        g2D.setStroke(new BasicStroke(1));
        g.setColor(Color.BLUE);
        Ellipse2D.Double earthOrbit = new Ellipse2D.Double(370-42.1230769231, 370-42.1230769231, 42.1230769231*2, 42.1230769231*2);
        g2D.draw(earthOrbit);

        g2D.setStroke(new BasicStroke(1));
        g.setColor(Color.RED);
        Ellipse2D.Double marsOrbit = new Ellipse2D.Double(370-53.7923076924, 370-53.7923076924, 53.7923076924*2, 53.7923076924*2);
        g2D.draw(marsOrbit);

        g2D.setStroke(new BasicStroke(1));
        g.setColor(Color.YELLOW);
        Ellipse2D.Double jupiterOrbit = new Ellipse2D.Double(370-197.238461539, 370-197.238461539, 197.238461539*2, 197.238461539*2);
        g2D.draw(jupiterOrbit);

        g2D.setStroke(new BasicStroke(1));
        g.setColor(Color.PINK);
        Ellipse2D.Double saturnOrbit = new Ellipse2D.Double(370-355.76923077, 370-355.76923077, 355.76923077*2, 355.76923077*2);
        g2D.draw(saturnOrbit);

    }
}
