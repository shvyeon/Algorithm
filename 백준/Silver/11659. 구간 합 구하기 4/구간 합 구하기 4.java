import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine()); // 첫째줄
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int[] arr = new int[n+1];

        str = new StringTokenizer(br.readLine()); // 둘째줄
        arr[0] = 0;
        for (int i=0; i<n; i++) {
            arr[i+1] = arr[i] + Integer.parseInt(str.nextToken());
        }
    //    System.out.println(Arrays.toString(arr));
        for (int i=0; i<m; i++) {
            str = new StringTokenizer(br.readLine()); // 셋째줄
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            int sum = arr[b] - arr[a-1];
            System.out.println(sum);
        }

        br.close();
    }
}