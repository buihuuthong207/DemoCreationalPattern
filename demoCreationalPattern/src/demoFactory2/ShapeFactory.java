package demoFactory2;

public class ShapeFactory {
  public void viewCar(String type)
  {
	  Shape shape;
	  if(type.equalsIgnoreCase("chu nhat"))
	  {
		  shape = new Rectangle();
		  shape.view();
	  }
	  else if(type.equalsIgnoreCase("tam giac"))
	  {
		  shape = new Triangle();
		  shape.view();
	  }
	  else if(type.equalsIgnoreCase("hinh vuong"))
	  {
		  shape = new Square();
		  shape.view();
	  }
	  else
	  {
		  System.out.println("meo co hinh nao");
	  }
  }
}
