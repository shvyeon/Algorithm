import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(str.nextToken()));
        }
        Collections.sort(list);

        int sum = 0;
        int result = 0;
        
        for(int i=0; i<n; i++){
            sum += list.get(i);
            result += sum;

        }
        System.out.println(result);
    }
}
