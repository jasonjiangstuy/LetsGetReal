public class myTester {
    public static void main(String[] args) {

        // testing
        System.out.println("should all be true");
        System.out.println("Testing RealNumber");
            System.out.println("Testing Equals");
        
            RealNumber x = new RealNumber(0);
            RealNumber y = new RealNumber(0);

            System.out.println("two 0s:" + x.equals(y));

            y = new RealNumber(0.00001);
            System.out.println("1 0s:" + !x.equals(y));

            x = new RealNumber(1);
            y = new RealNumber(1.00001);
            System.out.println("Close enough:"  + x.equals(y));
            
        System.out.println("Testing RealNumber Opts");
            x = new RealNumber(3);
            y = new RealNumber(4);

            System.out.println("Add: " + (3+4 == x.add(y).getValue()));

            System.out.println("Mulitplys: " + (3 *4 == x.multiply(y).getValue()));
            System.out.println("Divide: " + ((double)3 / 4 == x.divide(y).getValue()));
            // System.out.println(x.divide(y).getValue());
            System.out.println("Subtract: " + (3-4 == x.subtract(y).getValue()));

    System.out.println("Testing RationalNumber");


        RationalNumber a = new RationalNumber(3, 4);
        RationalNumber b = new RationalNumber(4, 5);
        System.out.println("Testing RationalNumber to string");
        System.out.println(a.toString().equals("3/4"));
        System.out.println(b.toString().equals("4/5"));

        System.out.println("Testing RationalNumber Reduce");
        a = new RationalNumber(6, 4);
        b = new RationalNumber(10, 5);
        System.out.println(a.toString().equals("3/2"));
        System.out.println(b.toString().equals("2/1"));

        System.out.println("Testing RationalNumber Special 0 cases");
        a = new RationalNumber(6, 0);
        b = new RationalNumber(0, 6);
        System.out.println(a.toString().equals("0/1"));
        System.out.println(b.toString().equals("0/1"));

    }
    
}