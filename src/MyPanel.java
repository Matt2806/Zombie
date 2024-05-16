import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class MyPanel extends JPanel {

private Player p = new Player();
private Hole h = new Hole();
private ArrayList<Enemy> opp = new ArrayList<Enemy>(20);
    //Enemy opp = new Enemy();

    public MyPanel(){

        for(int i = 0; i < 20; i++){
         opp.add(new Enemy());
        }

        setPreferredSize(new Dimension(1400,750));
setFocusable(true);
requestFocus();
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                p.move(e);

            }
        });

    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
p.draw(g);
if(p.getX() > 670 && p.getY() > 450 && p.getX() < 700 && p.getY() < 480){
    System.exit(0);
}
h.draw(g);
for(int i = 0; i < opp.size(); i++){
    opp.get(i).walk(p.getX(), p.getY());
    opp.get(i).drawE(g);
    if(opp.get(i).getX() > 670 && opp.get(i).getY() > 450 && opp.get(i).getX() < 700 && opp.get(i).getY() < 480){
     opp.remove(i);
    }
     if(opp.get(i).getX() == p.getX() && opp.get(i).getY() == p.getY()){
         System.exit(0);
     }
}
        //delay
        try {
            Thread.sleep(5);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        // calls paintComponent again
        repaint();
    }

}
