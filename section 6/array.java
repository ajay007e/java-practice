import java.util.Random;

public class array {

    public static void main(String[] args) {
        
        // int a[] = new int[5];        --> method 1 :to create a new array
        int a[] = {1,2,3,4,5};          //  method 2 :create a new array 

        
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        
        // for(int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }
        
        // enhanced for loop in java


        Random r = new Random();                // random number generator class
        

        for(int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10);
        }

        // for (int i:a){
        //     System.out.println(i);
        // }

        // exception handling

        try {
            System.out.println(a[6]);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(0);
        }
    }
    
}
