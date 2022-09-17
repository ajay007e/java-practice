public class armstrongNumber {
    
    public static void main(String[] args) {
        
        int n = 153;
        boolean b = isArmstrongNumber(n);

        if (b) System.out.println("An Armstrong Number");
        else System.out.println("Not a Armstrong Number");
    }

    public static boolean isArmstrongNumber(int n) {


        int t =0,k=n;
        while(k>0){
            int r = k%10;
            t = t+ r*r*r;
            k /=10;
        }
        if (t==n) return true;

        return false;
    }
}
