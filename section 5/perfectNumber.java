public class perfectNumber {
    
    public static void main(String[] args) {
        
        int n = 6;
        boolean b = isPerfect(n);
        if (b) System.out.println("Perfect Number");
        else System.out.println("Not Perfect Number");
    }

    public static boolean isPerfect(int n) {

        int t = 0;
        for (int i = 1; i <= n/2; i++){
            if (n%i == 0){
                  t = t+  i;
            }
        }
        if (t == n) return true;
        return false;
    }
}
