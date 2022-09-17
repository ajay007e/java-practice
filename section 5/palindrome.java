public class palindrome {
    
    public static void main(String[] args) {
        
        int a=0,b = 12221,r,n = b;
        while(n>0){
            r = n%10;
            a = a*10+r;
            n /= 10;
        }

        if(a==b){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }


    }
}
