package hackrun.mapproblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by nikaixuan on 25/4/19.
 */
public class MagazineNote {

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magMap = new HashMap<>();
        for(String words:magazine){
            if(magMap.containsKey(words)){
                magMap.put(words,magMap.get(words)+1);
            }else{
                magMap.put(words,1);
            }
        }
        boolean flag = true;
        for(String word:note){
            if(!magMap.containsKey(word)){
                flag = false;
                break;
            }
            int counter = magMap.get(word)-1;
            if(counter==0){
                magMap.remove(word);
            }else{
                magMap.put(word,counter);
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
