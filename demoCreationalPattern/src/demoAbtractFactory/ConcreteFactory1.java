package demoAbtractFactory;

public class ConcreteFactory1 extends AbtractFactory {
	@Override
    public AbstractProductA getProductA() {
        return new ProductA1();
    }
 
    @Override
    public AbstractProductB getProductB() {
        return new ProductB1();
    }
}
