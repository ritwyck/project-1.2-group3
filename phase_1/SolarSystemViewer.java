package phase_1;
import java.awt.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class SolarSystemViewer 
{
    public static void main(String[] args) 
    {
        JFrame solarSystemFrame = new JFrame();
        solarSystemFrame.setTitle("Solar System Visualization");
        solarSystemFrame.setBackground(new Color(000000));
        SolarSystem solarSystem = new SolarSystem();

        // JLabel planet;
        // ImageIcon sun;

        // sun = new ImageIcon(SolarSystemViewer.getResource("planet boss - sun.png"));
        // planet = new JLabel(sun);
        // SolarSystemViewer.add(planet);

        int w = 740;
        int h = 740;
        final int SOLAR_SYSTEM_WIDTH = w;
        final int SOLAR_SYSTEM_HEIGHT = h;

        solarSystemFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        solarSystemFrame.add(solarSystem);
        solarSystem.setPreferredSize(new Dimension(SOLAR_SYSTEM_WIDTH, SOLAR_SYSTEM_HEIGHT));
        solarSystemFrame.pack();
        solarSystemFrame.setResizable(false);
        solarSystemFrame.setLocationRelativeTo(null);
        solarSystemFrame.setVisible(true);
    }
}
