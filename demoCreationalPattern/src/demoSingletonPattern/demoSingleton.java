package demoSingletonPattern;

public class demoSingleton {
 private static volatile demoSingleton instance;
 
 private demoSingleton() {}
 public static demoSingleton getInstance(String value) {
     if (instance == null) {
         synchronized (demoSingleton.class) {
             if (instance == null) {
                 instance = new demoSingleton();
             }
         }
     }
     return instance;
 }
 
 public void show()
 {
	 System.out.println("Hello ngày mới");
 }
 
}
