package hackrun;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by nikaixuan on 28/4/19.
 */
public class SortClass {


    public static void main(String[] args){
        int[] testArr = {4,2,1,6,8,7,3,5};
        print(insertionSort(testArr));
        print(testArr);
//        System.out.println();
//        print(buddleSort(testArr));
//        System.out.println();
//        print(selectionSort(testArr));
//        System.out.println();
//        print(shellSort(testArr));
//        System.out.println();
//        print(quickSort(testArr,0,testArr.length-1));
//        System.out.println();
//        mergeSort(testArr);
//        System.out.println(Arrays.toString(testArr));

    }

    public static void print(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }

    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for (int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] buddleSort(int[] arr){
        for (int i=arr.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        //Another implementation
//        for (int i=0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }

        return arr;
    }

    public static int[] selectionSort(int[] arr){

        for (int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }

    public static int[] shellSort(int[] arr){

        int gap = arr.length;
        while (gap>1){
            gap = gap/3+1;
            for (int i=gap;i<arr.length;i++){
                int j=i-gap;
                while(j>=0){
                    if (arr[j]>arr[j+gap]){
                        int temp = arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap] = temp;
                        j-=gap;
                    }else {
                        break;
                    }
                }
            }
        }
        return arr;
    }

    public static int[] quickSort(int[] arr, int left, int right){

        if (left<right){
            int base = partition(arr,left,right);
            quickSort(arr, left,base-1);
            quickSort(arr, base+1,right);
        }
        return arr;
    }

    private static int partition(int[] arr, int left, int right){

        int basic_index = left;
        int base = arr[left];

        for (int i=left+1;i<=right;i++){
            if (base>arr[i]){
                basic_index++;
                if (i!=basic_index){
                    int temp = arr[i];
                    arr[i] = arr[basic_index];
                    arr[basic_index] = temp;
                }
            }
        }
        arr[left] = arr[basic_index];
        arr[basic_index] = base;
        return basic_index;
    }

    public static void mergeSort(int[] arr){
        int[] copy = Arrays.copyOf(arr, arr.length);
        mergeSort(arr,copy,0,arr.length-1);
    }

    private static void mergeSort(int[] arr, int[] copy, int left, int right){

        if (left<right){
            int mid = (left+right)/2;
            mergeSort(arr,copy,left,mid);
            mergeSort(arr,copy,mid+1,right);
            merge(arr,copy,left,mid,right);
        }
    }

    private static void merge(int[] arr, int[] copy, int left, int mid, int right){

        int s1 = left;
        int s2 = mid+1;
        int index = left;

        while(s1<=mid&&s2<=right){
            if (copy[s1]>copy[s2]){
                arr[index++] = copy[s2++];
            }else {
                arr[index++] = copy[s1++];
            }
        }
        while (s1<=mid){
            arr[index++] = copy[s1++];
        }

        while(s2<=right){
            arr[index++] = copy[s2++];
        }

        for (int i = left; i <= right; i++) {
            copy[i] = arr[i];
        }
    }

}
