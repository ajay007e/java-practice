import java.util.Random;

public class twoDimArray {
    
    public static void main(String[] args) {

        Random r = new Random();
        
        // int a[]={1,2,3};
        // int b[]={4,5,6};
        // int c[]={7,8,9};

        // int p[][] = new int[3][3];
        int p[][] = {
                      {1,2,3},
                      {4,5,6},
                      {7,8,9}
                    };

        for(int i = 0; i < p.length; i++){
            for(int j=0; j < p[i].length; j++){
                System.out.print(p[i][j]+"  ");
            }
            System.out.println();
        }

        for(int i = 0; i < p.length; i++){
            for(int j=0; j < p[i].length; j++){
                p[i][j] = r.nextInt(10);
            }
        }

        for(int i[]:p){
            for(int j:i){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
}
