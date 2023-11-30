import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        for(int num : list) {
			sb.append(num).append('\n');
		}
		System.out.println(sb);
    }
}

