package Hackrun;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by nikaixuan on 24/4/19.
 */
public class Anagram {
    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int[] lettercount = new int[26];
        int result = 0;
        for(char i:a.toCharArray()){
            lettercount[i-'a']++;
        }
        for(char i:b.toCharArray()){
            lettercount[i-'a']--;
        }
        for(int i=0;i<lettercount.length;i++){
            result+=Math.abs(lettercount[i]);
        }
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
