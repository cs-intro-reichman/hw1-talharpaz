public class FVCalc {
    public static void main(String[] args) {
        
    // Defining variables

    int currentSum = Integer.parseInt(args [0]);
    double interestRate = Double.parseDouble(args[1]);
    int years = Integer.parseInt(args [2]);

    double rate = interestRate/100;

    double futureValue = currentSum * Math.pow( rate + 1 , years);

    // prints

    System.out.println(" After " + years + " years, a $" + currentSum + " saved at " + interestRate + "% will yield $" + (int)futureValue);
    

    }
}