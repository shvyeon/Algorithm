import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n.length(); i++){
            list.add(Integer.parseInt( String.valueOf(n.charAt(i))));
        }

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(element -> System.out.print(element + ""));

    }
}
