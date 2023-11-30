import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        int A = Integer.parseInt(str.nextToken());
        StringTokenizer str2 = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();


        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(str2.nextToken()));
        }
        Collections.sort(list);

        System.out.println(list.get(A-1));
    }
}
