import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int x = Integer.parseInt(o1.toString());
            int y = Integer.parseInt(o2.toString());

            if(Math.abs(x) > Math.abs(y)) {
                return Math.abs(x) - Math.abs(y);
            }else if(Math.abs(x) == Math.abs(y)) {
                return x - y;
            }else {
                return -1;
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(pq.isEmpty()){
                    sb.append("0\n");
                }else{
                    sb.append(pq.poll()).append("\n");
                }
            }else{
                pq.offer(x);
            }
        }
        System.out.println(sb);
    }
}
