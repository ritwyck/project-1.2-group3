package phase_1;

import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SolarSystemViewer {

    public static void main(String[] args) {
        
        JFrame solarSystemFrame = new JFrame();
        solarSystemFrame.setTitle("Solar System Visualization");

        SolarSystem solarSystem = new SolarSystem();

        final int SOLAR_SYSTEM_WIDTH = 800;
        final int SOLAR_SYSTEM_HEIGHT = 800;

        solarSystemFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        solarSystemFrame.add(solarSystem);
        solarSystem.setPreferredSize(new Dimension(SOLAR_SYSTEM_WIDTH, SOLAR_SYSTEM_HEIGHT));
        solarSystemFrame.pack();
        solarSystemFrame.setResizable(false);
        solarSystemFrame.setVisible(true);
    }
}
