package demoAbtractFactory;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbtractFactory factory1 = new ConcreteFactory1();
        Client client1 = new Client(factory1);
        client1.run();
         
        AbtractFactory factory2 = new ConcreteFactory2();
        Client client2 = new Client(factory2);
        client2.run();
	}

}
