package applet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by ZSH
 */
public class SimpleApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("AA Simple Applet",20,20);
    }

}
