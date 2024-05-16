import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
     //   frame.setSize(1000,750);

        MyPanel panel = new MyPanel();
        panel.setBackground(Color.GRAY);




        frame.add(panel);
frame.pack();
        frame.setVisible(true);




    }
}