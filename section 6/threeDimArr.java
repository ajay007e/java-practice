import java.util.Random;

public class threeDimArr {
    
    public static void main(String[] args) {
        
        Random r = new Random();

        int a[][][] = new int[3][3][2];

        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                for(int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = r.nextInt(100);
                }
            }
        }

        for(int i[][]:a){
            for (int j[]:i){
                for (int k:j){
                    System.out.println(k);
                }
            }
        }
    }
}
