package demoAbstractFactory2;

public class Square extends Shape {
  
    private int a;
    
    public Square(int b)
    {

    	this.a = b;
    }
    public int getCanh()
    {
    	return this.a;
    }

	@Override
	public int getChuvi() {
		// TODO Auto-generated method stub
		return 4*a;
	}

	@Override
	public int getDientich() {
		// TODO Auto-generated method stub
		return a*a;
	}
	
	public String toString()
	{
		return super.toString() + ", canh a: " + this.getCanh();
	}
}
