package hackrun;

/**
 * Created by nikaixuan on 17/6/19.
 */
public class PrimeNumber {

    public static void main(String[] args){
        for(int i=2;i<=100;i++){
            boolean flag = true;
            for (int j=2;j*j<i;j++){
                if (i%j==0){
                    flag = false;
                }
            }
            if (flag){
                System.out.println(i);
            }
        }
    }
}
