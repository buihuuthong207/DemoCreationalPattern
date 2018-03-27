package demoAbstractFactory2;

public class Triangle extends Shape {
	 private int chuvi;
	    private int dientich;
	    
	    public Triangle(int chuVi, int dienTich)
	    {
	    	this.chuvi = chuVi;
	    	this.dientich = dienTich;
	    }

	@Override
	public int getChuvi() {
		// TODO Auto-generated method stub
		return this.chuvi;
	}

	@Override
	public int getDientich() {
		// TODO Auto-generated method stub
		return this.dientich;
	}
}
