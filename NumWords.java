public class NumWords {
    public static void main(String[] args) {
        
        int userInput = Integer.parseInt(args[0]);
        int hundreds = userInput/100;
        int tens = (userInput/10)%10;  
        int ones = userInput%10;
        
       

        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");

    }
    
}
