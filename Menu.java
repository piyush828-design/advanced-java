import javax.swing.*;
import java.awt.*;
public class Menu extends JFrame
{
    JMenuBar mbr;
    JMenu file,edit,font;
    JMenuItem op,sa,cl,cp,pt,fl,f2;
    Menu()
    {
        Container c=getContentPane();
        c.setLayout(new BorderLayout());
        mbr=new JMenuBar();
        c.add(mbr,BorderLayout.NORTH);
        file=new JMenu("file");
        edit=new JMenu("edit");
        mbr.add(file);
        mbr.add(edit);
        op=new JMenuItem("open");
        sa=new JMenuItem("save");
        cl=new JMenuItem("close");
        cp=new JMenuItem("copy");
        pt=new JMenuItem("paste");
        file.add(op);
        file.add(sa);
        file.add(cl);
        edit.add(cp);
        edit.add(pt);
        file.addSeparator();
        font=new JMenu("font");
        file.add(font);
        fl=new JMenuItem("fl");
        f2=new JMenuItem("f2");
        font.add(fl);
        font.add(f2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
}
    public static void main(String args[])
    {
        Menu ob=new Menu();
        ob.setTitle("Menu");
        ob.setSize(400,400);
        ob.setVisible(true);
    }
}
