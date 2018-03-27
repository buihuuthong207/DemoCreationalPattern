package demoAbtractFactory;

public class ProductB2 extends AbstractProductB{
	@Override
    void interact(AbstractProductA a) {
        System.out.println(
            this.getClass().getName() 
                        + " interact with "
                        + a.getClass().getName()
        );
    }
}
