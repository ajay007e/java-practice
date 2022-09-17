public class swap {
    
    public static void main(String[] args) {
        
        int a=5,b=8;

        System.out.println("before swap -- a="+a+"  b="+b);

        // logic 1

        // int t = a;       
        // a = b;
        // b = t ;

        // logic 2

        // a = a + b;
        // b = a - b;
        // a = a - b;

        // logic 3

        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;

        // logic 4

        a = b + a - (b=a);

        System.out.println("after swap  -- a="+a+"  b="+b);

    }
}
