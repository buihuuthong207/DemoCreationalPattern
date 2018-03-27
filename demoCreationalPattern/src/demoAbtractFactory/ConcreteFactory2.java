package demoAbtractFactory;

public class ConcreteFactory2 extends AbtractFactory  {
	@Override
    public AbstractProductA getProductA() {
        return new ProductA2();
    }
 
    @Override
    public AbstractProductB getProductB() {
        return new ProductB2();
    }
}
