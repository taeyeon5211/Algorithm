import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();

        System.out.println((n * (n - 1)) / 2);
        System.out.print(2);
    }
}