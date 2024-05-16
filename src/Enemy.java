import java.awt.*;
import java.awt.event.KeyEvent;
public class Enemy {

    private int speed;
    private int x;
    private int y;
    private int size;

    public Enemy(){

speed = 1;

size = 20;

if(Math.random() < 0.5){
x = -20;
}else{
 x = 1410;
}

y = (int)(Math.random() * 750);
    }

public void walk(int px, int py){
if(Math.abs(px - x) < 200 && Math.abs(py - y) < 200) {

    if (px > x && Math.random() < .65) {
        x++;
    } else if(Math.random() < .65){
        x--;
    }
    if (py > y && Math.random() < .65) {
        y++;
    } else if(Math.random() < .65){
        y--;
    }

 }else if(x < 700 && Math.random() < .08){
    x++;
 }else if(x > 700 && Math.random() < .08){
    x--;
}
}

    public void drawE(Graphics g2) {
        g2.setColor(Color.GREEN);
        g2.fillRect(x, y, size, size);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

}
