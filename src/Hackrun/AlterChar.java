package Hackrun;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by nikaixuan on 24/4/19.
 */
public class AlterChar {
    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int result = 0;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==0){
                result++;
            }
        }
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
