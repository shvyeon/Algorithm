import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());

        int[] score = new int[n];
        int max = 0;
        int total = 0;

        for(int i=0; i<score.length; i++){
            score[i] = Integer.parseInt(str.nextToken());
            total += score[i];
            if(max <= score[i]){
                max = score[i];
            }
        }

        double avg = (double)total / max * 100 / n;
        System.out.println(avg);
        br.close();
    }
}