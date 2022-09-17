
import java.lang.Math;

public class prime {
    
    public static void main(String[] args) {
        
        int p = 1;
        boolean b = isPrime(p);

        if (b) System.out.println("Prime");
        else System.out.println("Not Prime");
    }

    public static boolean isPrime(int p) {

        if(p<2) return false;

        boolean b = true;

        for(int i = 2; i < Math.sqrt(p); i++) {
            if(p%i ==0){
                b = false;
                break;
            }
        }
        return b;
    }
}
