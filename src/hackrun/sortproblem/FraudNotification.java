package hackrun.sortproblem;

import java.util.*;

/**
 * Created by nikaixuan on 10/5/19.
 */
public class FraudNotification {

    public static void main(String[] args){

        System.out.println(5/2);
        int[] a = {10,20,30,40,50};
        System.out.println(activityNotifications(a,3));
        List abc = new ArrayList<>();
        System.out.println(0/5);

    }

    static int activityNotifications(int[] expenditure, int d) {

        int count = 0;
        // create freq array as exp <= 200 always
        //maintain a queue to find ontgoing and incoming exp
        //get median from freq array

        int freq[] = new int[201];
        Queue<Integer> q = new LinkedList<Integer>();

        for(int i=0;i<expenditure.length;i++)
        {
            while(i<d)
            {
                q.add(expenditure[i]);
                freq[expenditure[i]] = freq[expenditure[i]]+1;
                i++;
            }


            float median = getMedian(freq,d);

            if(expenditure[i] >= 2*median)
            {
                count++;
            }


            // removing outing going element freq
            int elem = q.remove();
            freq[elem] = freq[elem] - 1;

            // adding incoming element to freq
            q.add(expenditure[i]);
            freq[expenditure[i]] = freq[expenditure[i]]+1;
        }

        return count;
    }

    private static float getMedian(int[] freq,int d)
    {
        if(d%2 == 1)
        {
            int center = 0;
            for(int i=0;i<freq.length;i++)
            {
                center = center + freq[i];

                if(center > d/2)
                {
                    return i;
                }
            }
        }else{
            int count = 0;
            int first = -1;
            int second = -1;
            for(int i=0;i<freq.length;i++)
            {
                count = count + freq[i];

                if(count == d/2)
                {
                    first = i;
                }else if(count > d/2)
                {
                    if(first < 0 ) first = i;
                    second = i;

                    return ((float)first + (float)second)/2;
                }
            }
        }
        return 0f;
    }
}
