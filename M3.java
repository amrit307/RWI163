import java.awt.*;
class M3 extends Frame
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;

	M3()
	 {
	  b1 = new Button("ok");
	  b2 = new Button("cancel");
	  l1 = new Label("num");
	  l2 = new Label("num");
	  t1 = new TextField();
	  t2 = new TextField();
	  add(b1);
	  add(b2);
	  add(l1);
	  add(l2);
	  add(t1);
	  add(t2);

	  GridLayout g = new GridLayout(3,2);
	  setLayout(g);
	  }

	  public static void main(String[] args)
	  {
       M3 x = new M3();
       x.setSize(1000,300);
       x.setVisible(true);
	  }
	 }
