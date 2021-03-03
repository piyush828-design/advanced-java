import java.awt.*;
import java.awt.event.*;
 class Eventdm
{

   Frame f1=new Frame();
   Button b1=new Button("click");
   TextField tf1=new TextField(40);
   
              Eventdm()
           {
               f1.setLayout(new FlowLayout());
               
               f1.add(b1);
               f1.add(tf1);
               A a=new A(tf1);
               
               b1.addActionListener(a);
               f1.setSize(450,450);
               f1.setVisible(true);
           }


           public static void main(String args[])
           {
               Eventdm e=new Eventdm();
           }
           class A implements ActionListener
           {
               TextField tf1;
               A (TextField tf1)
               {
                   this.tf1=tf1;
                   
               }
               public void actionPerformed(ActionEvent ae)
               {
                   tf1.setText("welcome");
               }
           }
}