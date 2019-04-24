package Hackrun;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nikaixuan on 24/4/19.
 */
public class ValidString {
    // Complete the isValid function below.
    static String isValid(String s) {
        if(s.length()<=2) return "YES";
        char[] arr = new char[26];
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']+=1;
        }
        boolean flag = false;
        Arrays.sort(arr);
        int i=0;
        while(arr[i]==0){
            i++;
        }
        int min = arr[i];
        int max = arr[25];
        if(min==max) {flag=true;}
        if((max>arr[24]&&max-min==1)||
                (min==1&&max==arr[i+1])){
            flag=true;
        }
        if(flag) {return "YES";}
        else {return "NO";}


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
