import java.awt.*;
import java.awt.event.KeyEvent;

public class Player {

    private int speed;
    private int x;
    private int y;
    private int size;


    public Player() {
        speed = 10;
        x = 700;
        y = 380;
        size = 20;
    }

    public void draw(Graphics g2) {
        g2.setColor(Color.RED);
        g2.fillRect(x, y, size, size);
    }


    public void move(KeyEvent k){
  int key = k.getKeyCode();

  int right = KeyEvent.VK_RIGHT;
  int left = KeyEvent.VK_LEFT;
  int up = KeyEvent.VK_UP;
  int down = KeyEvent.VK_DOWN;

  if(key == right && x < 1400 - size){x += speed;}

   if(key == left && x > 0){x -= speed;}

   if(key == up && y > 0){y -= speed;}

   if(key == down && y < 750 - size){y += speed;}

    }

public int getX(){
        return x;
}

public int getY(){
        return y;
}

}

