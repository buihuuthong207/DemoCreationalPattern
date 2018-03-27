package demoAbstractFactory2;

public class SquareFactory implements ShapeAbstractFactory{

 private int a;
 
 public SquareFactory(int b)
 {

	 this.a = b;
 }
@Override
public Shape createShape() {
	// TODO Auto-generated method stub
	return new Square(a);
}
}
