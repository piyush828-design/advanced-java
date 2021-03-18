import javax.swing.*;
public class Table
{
    JFrame f;
    Table()
    {
        f=new JFrame();
       String data[][]={ {"1","sharma","vishal"},
       {"2","mehta","karan"},
       {"3","kishan","ishan"}
    };
        
      String column[] ={"CustomerID","FirstName","LastName"};
   JTable jt=new JTable(data,column);
   jt.setBounds(30,40,200,300);
   JScrollPane sp=new JScrollPane(jt);
   f.add(sp);
   f.setSize(200,200);
   f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

public static void main(String args[])
{
    new Table();
}
}
