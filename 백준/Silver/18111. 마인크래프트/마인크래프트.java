import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];

        int max = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, arr[i][j]);
                min = Math.min(min, arr[i][j]);
            }
        }

        int minSecond = Integer.MAX_VALUE;
        int highBlock = 0;

        for (int i = min; i <= max; i++) {
            int second = 0;
            int block = B;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (i > arr[j][k]) {
                        second += i - arr[j][k];
                        block -= i - arr[j][k];
                    } else if (i < arr[j][k]) {
                        second += (arr[j][k] - i) * 2;
                        block += arr[j][k] - i;
                    }
                }
            }

            if (block < 0) continue;
            if (second <= minSecond) {
                minSecond = second;
                highBlock = Math.max(i, highBlock);
            }
        }

        System.out.println(minSecond + " " + highBlock);
    }
}
