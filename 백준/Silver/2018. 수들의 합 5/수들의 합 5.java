import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());

        int start =1;
        int end = 1;
        int sum = 1;
        int result = 0;

        while(start <= end){
            if(sum < n){
                end++;
                sum += end;
            }else if(sum > n){
                sum -= start;
                start++;
            }else if(sum == n){
                result++;
                end++;
                sum += end;
            }
        }
        System.out.println(result);
        br.close();
    }
}
