public class labeledBreak{

    public static void main(String[] args) {
        
        // break : come out of the block

        la:
        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i == 3){
                    break la;               // labeled break
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}