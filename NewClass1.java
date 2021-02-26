
import java.awt.*;
import java.awt.event.*;
        
 class NewClass1 extends Frame
 {
     NewClass1()
     {
            this.addWindowListener(new WindowAdapter()
              {
        public void WindowClosing(WindowEvent e)
        {
            System.exit(0);
        }
});
}
public void paint(Graphics g)
{
g.setColor(Color.green);

g.drawRect(40,40,200,200);

g.drawOval(90,70,80,80);
g.drawOval(110,95,5,5);
g.drawOval(145,95,5,5);
g.drawLine(130,95,130,115);
g.drawArc(113,115,35,20,0,-180);
}
public static void main(String args[])
{
NewClass1 d=new NewClass1();
d.setSize(400,400);
d.setTitle("drawing");
d.setVisible(true);
}
}

