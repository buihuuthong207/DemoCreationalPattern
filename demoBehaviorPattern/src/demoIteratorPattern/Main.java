package demoIteratorPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentRepository repository = new StudentRepository();
        
        for (Iterator i = repository.getIterator(); i.hasNext();) {
            System.out.println(i.next());
        }
	}

}
