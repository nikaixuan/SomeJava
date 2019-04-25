package hackrun.naiveproblem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by nikaixuan on 17/4/19.
 */
public class RepeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        char[] sChar = s.toCharArray();
        long len = sChar.length;
        int aCount = 0;
        int aCountsub = 0;
        for(int i=0;i<len;i++){
            if(sChar[i]=='a') aCount++;
        }
        int a = (int)(n%len);
        String subs = s.substring(0,a);
        char[] subChar = subs.toCharArray();
        for(int i=0;i<subChar.length;i++){
            if(subChar[i]=='a') aCountsub++;
        }
        return n/len*aCount+aCountsub;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
