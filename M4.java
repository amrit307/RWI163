import java.awt.*;
class M4 extends Frame
{
	Button b1,b2;

    M4()
     {
       b1 = new Button("cancel");
       b2 = new Button("ok");
       add (b1);
       add (b2);

       setLayout(null);

       b1.setBounds(100,80,90,30);
       b2.setBounds(230,80,70,30);
     }

     public static void main(String[] args)
	  {
       M4 x = new M4();
       x.setSize(1000,300);
       x.setVisible(true);
}
}