import java.applet.*;
import java.awt.*;
/*<applet code= sample width=300 height=300>
 </applet>
 */
public class sample extends Applet
{
    String msg1,msg2,msg3,msg4;
    public void init()
    {
        msg1="this is msg 1 in init method";

    }
public void start()
{
    msg2="this is msg 2 in start method";

}
public void stop()
{
    msg3="this is msg 3 in stop method";

}
public void destroy()
    {
        msg4="this is msg 4 in destroy method";

    }
    public void paint(Graphics g)
    {
        g.drawString("this is demonstration",20,40);
        if(msg1!=null)
        {
            g.drawString(msg1,20,80);
        }
        if(msg2!=null)
        {
            g.drawString(msg2,20,120);
        }
        if(msg3!=null)
        {
            g.drawString(msg3,20,160);
        }
        if(msg4!=null)
        {
            g.drawString(msg4,20,200);
        }
    
    }

}