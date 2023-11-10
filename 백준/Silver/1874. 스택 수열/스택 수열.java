import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int idx = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 1이상 n이하의 정수
        for (int i = 1; i <= n; i++) {
            stack.push(i);
            sb.append("+\n");
            while (!stack.isEmpty() && stack.peek() == arr[idx]) {
                stack.pop();
                sb.append("-\n");
                idx++;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}
