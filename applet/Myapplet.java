import java.applet.*;
import java.awt.*;
/*
<applet code =Myapplet width=200 height=150>
</applet>
*/
public class Myapplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("welcome to applet world",20,40);
    }
}
