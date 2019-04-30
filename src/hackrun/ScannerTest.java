package hackrun;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * Created by nikaixuan on 29/4/19.
 */
public class ScannerTest {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        for (int i=1;i<101;i++){
            System.out.println((i%15==0)?"FizzBuzz":(i%5==0)?"Buzz":(i%3==0)?"Fizz":String.valueOf(i));
        }



    }
}
