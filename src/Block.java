import java.awt.*;

/**
 * Created by GangChen on 4/20/2018.
 */
public class Block extends Rectangle {
    Image pic;
    Block(int a, int b, int w, int h, String s) {
        x = a;
        y = b;
        width = w;
        height = h;
        pic = Toolkit.getDefaultToolkit().getImage(s);
    }

    public void draw(Graphics g, Component c) {
        g.drawImage(pic, x, y, width, height, c);
    }
}
