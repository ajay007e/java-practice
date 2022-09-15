class increment {
    
    public static void main(String[] args) {
        
        int i = 5;
        int j;

        
        j=i++;                    // post increment : assign first, then increment
        System.out.println(i+":"+j);

        j=++i;                    // pre increment : increment first, then assign
        System.out.println(i+":"+j);

        /*
        
        but in the case of the following statement:
            i = i++;
            the value of the varible will not be change, it is because the mechanism the above statement is as follows:
            t = i;
            i++;
            i = t;

         */
        System.out.println(i);
        i = i++;
        System.out.println(i);

    }
}
