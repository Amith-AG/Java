import java.applet.*;
import java.awt.*;
/*
 <applet code=Active width=400 height=400>
</applet>
 */
public class Active extends Applet
{
    public String state()
    {
        if(isActive())
        return "applet is alive";
        else
        return "applet is dead";
    }
    public void paint(Graphics g)
    {
        g.drawString("Demo:",0,0);
        g.drawString(state(),40,40);
        showStatus("text for status bar");

    }
}