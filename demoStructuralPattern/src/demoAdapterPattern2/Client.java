package demoAdapterPattern2;

public class Client {


    static public Target Create( String str ) {

        if ( str.equals( "Target" ) ) return new Target();
        if ( str.equals( "Adapter" ) ) return new Adapter();
        return null;

    }

    static public void main( String[] args ) {

        Target target1 = Create( "Target" );
        Target target2 = Create( "Adapter" );
        target1.operation();
        target2.operation();

    }

}
