package hackrun.arrayproblem;

import java.util.Scanner;

/**
 * Created by nikaixuan on 23/4/19.
 */
public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        boolean flag = true;
        int result = 0;
        for(int i=0;i<q.length;i++){
            if(q[i]-i-1>2){
                flag = false;
                break;
            }else{
                for(int j=Math.max(0,q[i]-2);j<i;j++){
                    if(q[i]<q[j]){
                        result++;
                    }
                }
            }
        }
        if(flag){
            System.out.println(result);
        }else{
            System.out.println("Too chaotic");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
