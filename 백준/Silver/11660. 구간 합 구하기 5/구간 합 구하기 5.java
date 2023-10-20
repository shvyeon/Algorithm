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
        int[][] arr = new int[n+1][n+1];

        for (int i=1; i<=n; i++) {
            str = new StringTokenizer(br.readLine()); // 둘째줄
            for(int j=1; j<=n; j++){
                arr[i][j] = arr[i][j-1]+ Integer.parseInt(str.nextToken());
            }
        }
       // System.out.println(Arrays.deepToString(arr));
        int[] sum = new int[m];
        for (int i=0; i<m; i++) {
            str = new StringTokenizer(br.readLine()); // 셋째줄
            int x1 = Integer.parseInt(str.nextToken());
            int y1 = Integer.parseInt(str.nextToken());
            int x2 = Integer.parseInt(str.nextToken());
            int y2 = Integer.parseInt(str.nextToken());
            for(int j=x1; j<=x2;j++){
                sum[i] += arr[j][y2] - arr[j][y1-1];
            }
        }
     //   System.out.println(Arrays.toString(sum));
        for (int j : sum) {
            System.out.println(j);
        }
        br.close();
    }
}