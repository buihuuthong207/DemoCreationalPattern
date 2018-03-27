package demoAbtractFactory;

public class Client {
	public AbstractProductA abstractProductA;
    public AbstractProductB abstractProductB;
     
    public Client(AbtractFactory factory){
        abstractProductA = factory.getProductA();
        abstractProductB = factory.getProductB();
    }
     
    public void run(){
        abstractProductB.interact(abstractProductA);
    }
}
