public class fib {

    public static void main(String[] args) {
        
        int i=1,k=0,j=1;
        int n = 30;

        System.out.print("1 1 ");

        k = j+i;
        i = j;
        j = k;
        while(k<n){
            System.out.print(k+" ");
            k = j+i;
            i = j;
            j = k;

        }
        System.out.println();

    }
    
}
