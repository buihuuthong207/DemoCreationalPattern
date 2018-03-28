package demoIteratorPattern;

public class StudentRepository implements Container {
public static String[] students = {"An", "Binh", "Chi"};
    
    @Override
    public Iterator getIterator() {
        return new StudentIterator();
    }

    private static class StudentIterator implements Iterator {

        int index;
        
        @Override
        public boolean hasNext() {
            return (index < students.length);
        }

        @Override
        public Object next() {
            return hasNext() ? students[index++] : null; 
        }
    }
}
