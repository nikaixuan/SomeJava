package Hackrun;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nikaixuan on 17/4/19.
 */
public class HourglassSum {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int[] resultarr = new int[(int)Math.pow(arr.length-2,2)];
        int[] onedarr = new int[(int)Math.pow(arr.length,2)];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                onedarr[i*arr.length+j] = arr[i][j];
            }
        }
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr.length-2;j++){
                int result = 0;
                int index = i*arr.length+j;
                result = onedarr[index]+onedarr[index+1]+onedarr[index+2]+onedarr[index+7]+onedarr[index+12]+onedarr[index+13]+onedarr[index+14];
                resultarr[i*(arr.length-2)+j] = result;
            }
        }
        Arrays.sort(resultarr);
        return resultarr[15];

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
