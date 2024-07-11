import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N- 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (arr[i] + arr[j] + arr[k] <= M) {
                        sum = Math.max(sum, arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
