package shankar;

class Singleton1 {

        private static Singleton1 singleton = new Singleton1( );

        /* A private Constructor prevents any other
         * class from instantiating.
         */
        private Singleton1() { }

        /* Static 'instance' method */
        public static Singleton1 getInstance( ) {
            return singleton;
        }

        /* Other methods protected by singleton-ness */
        protected static void demoMethod( ) {
            System.out.println("demoMethod for singleton");


        }
    }

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton1 t = Singleton1.getInstance( );
        Singleton1 t2 = Singleton1.getInstance( );

        t.demoMethod( );
        t.demoMethod( );



    }


        }

