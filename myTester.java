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


    }
    
}
