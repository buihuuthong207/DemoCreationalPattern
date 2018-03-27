package demoFacadePattern;

public class Facade {
  private Shape square;
  private Shape rectangle;
  
  public Facade()
  {
	  square = new Square();
	  rectangle = new Rectangle();
  }
  public void DrawAll()
  {
	  this.DrawRectangle();
	  this.DrawSquare();
  }
  public void DrawSquare()
  {
	  square.Draw();
  }
  
  public void DrawRectangle()
  {
	  rectangle.Draw();
  }
}
