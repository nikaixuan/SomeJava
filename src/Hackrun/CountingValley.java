package Hackrun;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by nikaixuan on 17/4/19.
 */
public class CountingValley {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int height = 0;
        int valleyNum = 0;
        char[] sa = s.toCharArray();
        for(int i=0;i<sa.length;i++){
            if(sa[i]=='U') height++;
            if(sa[i]=='D'){
                if((height--)==0){
                    valleyNum++;

                }
            };
        }
        return valleyNum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
