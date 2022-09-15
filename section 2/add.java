
class add{
    public static void main(String args[]){
        // Task 1 - Hardcoding
        System.out.println(3+5);

        // Task 2 - Datatypes

        // int - 4 bytes, float - 4 bytes, double - 8 bytes, char - 2 bytes
        // short int - 4 bytes, long int - 8 bytes, byte - 1 byte

        int num1 = 3;
        int num2 = 5;
        System.out.println(num1+num2);

        // Task 3 - Datatypes continues

        // all real numbers are double in java
        // if we want to to use float instead of double, then we need to use f at the end of the real number
        // float num = 5.3 will be an error

        float num3 = 1.4f;
        float num4 = 1.3f;
        System.out.println(num3+num4);

        // Task 4 - Datatypes continues

        //  all the characters should be in ''
        //  all characters are stored in the computer as ascci values

        char c1 = 'a';
        System.out.println(c1);

        //  typecasting the character into int

        System.out.println((int)c1);

        //  typecasting the int into character
         
        System.out.println((char)68);

        // Task 5 - Naming conventions

        // interface names are adjectives (capital camel case)
        // class names are nouns (capital camel case)
        // method names are verbs (camel case)
        // variable names are something meaningful for example (camel case)
        // constants names are something meaningful for example (uppercase)
        // package names are something meaningful for example (lowercase)
         


    }
}