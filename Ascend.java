public class Ascend {
    public static void main(String[] args) {

        int lim = Integer.parseInt(args[0]);
        
        int a = (int)(Math.random() * lim);
        int b = (int)(Math.random() * lim);
        int c = (int)(Math.random() * lim);

        int min = Math.min(a, b);
        min = Math.min(min, c);

        int max = Math.max(a, b);
        max = Math.max(max, c);

        int med = a + b + c - max - min;

        System.out.println( min + " " + med + " " + max );

    }
    
}
