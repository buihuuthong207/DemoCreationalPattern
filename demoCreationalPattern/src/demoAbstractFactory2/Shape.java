package demoAbstractFactory2;

public abstract class Shape {
 public abstract int getChuvi();
 public abstract int getDientich();
 
 public String toString()
 {
	 return "chu vi: " + this.getChuvi() + ", dien tich: " + this.getDientich();
 }
}
