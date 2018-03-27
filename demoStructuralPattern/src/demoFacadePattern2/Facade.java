package demoFacadePattern2;

public class Facade {
  private Car Honda;
  private Car Yamaha;
  
  public Facade()
  {
	  Honda = new Honda();
	  Yamaha = new Yamaha();
  }
  
  public void ViewHonda()
  {
	  Honda.View();
  }
  
  public void ViewYamaha()
  {
	  Yamaha.View();
  }
  
  public void TypeHonda()
  {
	  Honda.Type();
  }
  
  public void TypeYamaha()
  {
	  Yamaha.Type();
  }
}
