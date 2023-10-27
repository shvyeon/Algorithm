import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 재료의 개수
        int m = Integer.parseInt(br.readLine()); // 갑옷을 만드는데 필요한 수

        StringTokenizer str = new StringTokenizer(br.readLine()); // 재료들이 가진 고유한 번호
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(arr);

        int result = 0;
        int start = 0; // 시작
        int end = n-1; // 끝

        while(start<end){
            if(arr[start] + arr[end] < m){
                start++; // 시작 포인터 뒤로 옮김
            }else if(arr[start] + arr[end] > m){
                end--; // 끝 앞으로 옮김
            }else if(arr[start] + arr[end] == m){
                result++;
                start++;
                end--;
            }
        }
        System.out.println(result);
        br.close();
    }
}
