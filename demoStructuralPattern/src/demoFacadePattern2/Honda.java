package demoFacadePattern2;

import javax.swing.JOptionPane;

public class Honda implements Car {

	@Override
	public void View() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Honda","from thong", JOptionPane.OK_CANCEL_OPTION);
	}

	@Override
	public void Type() {
		// TODO Auto-generated method stub
		  System.out.println("\n\t Honda");
		  System.out.println("Air Blade");
		  System.out.println("Wave RSX");
		  System.out.println("Future Neo");
	}

}
