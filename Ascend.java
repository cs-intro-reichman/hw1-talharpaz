// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        int c = (int)(Math.random() * 100);

        int min = Math.min(a, b);
        min = Math.min(min, c);

        int max = Math.max(a, b);
        max = Math.max(max, c);

        int med = a + b + c - max - min;

        System.out.println( min + " " + med + " " + max );

	}
}
