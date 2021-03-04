
import java.awt.*;
import java.awt.event.*;

 class close extends Frame
 {
     public static void main(String args[])
{
  
         

         close c1=new close();
         c1.setTitle("click to close");
         c1.setSize(500,450);
         c1.setVisible(true);
         c1.addWindowListener(new New());
     }
     
 }
class New implements WindowListener
{
    public void WindowActivated(WindowEvent e){}
    public void WindowClosed(WindowEvent e){}
    public void WindowClosing(WindowEvent e)
    {
    System.exit(0);
    }
    public void WindowDeactivated(WindowEvent e){}
    public void WindowDeiconified(WindowEvent e){} 
    public void WindowIconified(WindowEvent e){}
    public void WindowOpened(WindowEvent e){}

}

    