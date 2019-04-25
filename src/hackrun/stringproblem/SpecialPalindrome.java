package hackrun.stringproblem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by nikaixuan on 25/4/19.
 */
public class SpecialPalindrome {
    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        int index = 0;
        long res = n;
        while(index<n){
            int add = 0;
            while(index+add+1<n&&s.charAt(index)==s.charAt(index+add+1)){
                add++;
            }
            res+=add*(add+1)/2;
            int addafter = 0;
            if(index+add+2+addafter<n&&s.charAt(index)==s.charAt(index+add+2+addafter)){
                while(addafter<=add&&index+add+2+addafter<n&&s.charAt(index)==s.charAt(index+add+2+addafter)){
                    addafter++;
                }
                res+=addafter;
            }
            index+=add+1;
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
