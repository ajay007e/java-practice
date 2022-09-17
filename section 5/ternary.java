public class ternary {
    
    public static void main(String[] args) {
        int i, j;
        i=5;
        j=1;

        // if(j==1){
        //     i=10;
        // }
        // else{
        //     i=0;
        // }

        i = j==1 ? 10 : 0;              // ternary operator

        System.out.println(i);

        // expecption : this is due to the fact that ternary operator checks for the type of the values and assign max sized values by typecasting

        Object obj1;
        Object obj2;

        if(true){ obj1 = new Integer(10);}
        else{ obj1 = new Float(10);}

        System.out.println(obj1);

        obj2 = true?new Integer(10):new Float(10);      // here the interger object is type casted into float object

        System.out.println(obj2);
    }
}
