import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int sum = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for(int j=0; j<n; j++){
            sum += Integer.parseInt(String.valueOf(str.charAt(j)));
        }

        br.close();
        System.out.print(sum);
    }
}