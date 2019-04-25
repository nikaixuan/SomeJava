package hackrun.mapproblem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by nikaixuan on 25/4/19.
 */
public class TwoStrings {
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Map<Character,Integer> a = new HashMap<>();
        for(Character i:s1.toCharArray()){
            if(a.containsKey(i)){
                a.put(i,a.get(i)+1);
            }else{
                a.put(i,0);
            }
        }
        int charcounter = 0;
        for(Character i:s2.toCharArray()){
            if(!a.containsKey(i)){
                charcounter++;
            }
        }
        if(charcounter==s2.length()){
            return "NO";
        }else{
            return "YES";
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
