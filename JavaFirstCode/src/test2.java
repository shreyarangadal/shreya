public  class test2 {
        public static void main( String args[] )
        {
            String s1 = new String( "Test" );
            String s2 = new String( "Test" );

            System.out.println( "\n1 - PRIMITIVES ");
            System.out.println( s1 == s2 ); // false
            System.out.println( s1.equals( s2 )); // true

            //A a1 = new A();
           // A a2 = new A();

            String s3 = "Test" ;
            String s4 = "Test" ;

            System.out.println( s3 == s4 ); // false
            System.out.println( s3.equals( s4 )); // true

           // System.out.println( "\n2 - OBJECT TYPES / STATIC VARIABLE" );
            //System.out.println( a1 == a2 ); // false
           // System.out.println( a1.s == a2.s ); // true
            //System.out.println( a1.s.equals( a2.s ) ); // true

            //B b1 = new B();
           // B b2 = new B();

           // System.out.println( "\n3 - OBJECT TYPES / NON-STATIC VARIABLE" );
           // System.out.println( b1 == b2 ); // false
           // System.out.println( b1.getS() == b2.getS() ); // false
           // System.out.println( b1.getS().equals( b2.getS() ) ); // true
        }
}
