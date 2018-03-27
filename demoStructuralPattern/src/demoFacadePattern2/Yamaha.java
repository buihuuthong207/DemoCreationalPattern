package demoFacadePattern2;

import javax.swing.JOptionPane;

public class Yamaha implements Car{
  public void View()
  {
	  JOptionPane.showMessageDialog(null,"Yamaha","from thong", JOptionPane.INFORMATION_MESSAGE);
  }
  public void Type()
  {
	  System.out.println("\n\t Yamaha");
	  System.out.println("Ex bat cho");
	  System.out.println("Jupiter");
	  System.out.println("Janus");
  }
}
