import java.awt.*;

public class Hole {

    private int x;
    private int y;
    private int size;

    public Hole(){
    x = 670;
    y = 450;
    size = 50;

    }

    public void draw(Graphics g2) {
        g2.setColor(Color.BLACK);
        g2.fillOval(x, y, size, size);
    }

}
