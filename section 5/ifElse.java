public class ifElse {
    
    public static void main(String[] args) {
         int i = 4;

         if (i%2==0){
            System.out.println("even");
         }
         else{
            System.out.println("odd");
         }


         int a,b,c;
         a=3;
         b=6;
         c=1;

         if(a>b && a>c){
             System.out.println(a+" is the biggest");
         }
         else if(b>c){
             System.out.println(b+" is the biggest");
        }
        else{
            System.out.println(c+" is the biggest");
        }
    }
}
