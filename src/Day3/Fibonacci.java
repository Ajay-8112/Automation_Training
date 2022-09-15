package Day3;

public class Fibonacci {
    public static void main(String args[]) {
        int n = 20, a = 0, b = 1;
        System.out.println("Fibonacci sequence: ");

        for (int i = 1; i < n; ++i) {
            System.out.println(a + "");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}