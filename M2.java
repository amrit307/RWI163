import java.awt.*;
class M2 extends Frame
{
 Button b1,b2;
 M2()
 {
  b1 = new Button("OK");
  b2 = new Button("CANCEL");
  add(b1);
  add(b2);
  GridLayout g = new GridLayout(1,2);
  setLayout(g);
  }

  public static void main(String[] args)
  {
  M2 x = new M2();
  x.setSize(1000,300);
  x.setVisible(true);

  }
 }
