package demoAdapterPattern2;

public class Adapter extends Target {


    private Adaptee obj = new Adaptee();

    public void operation() {
    request();

    }

    private void request() {

        obj.speRequest();

    }

}
