package ChapterSevenExcercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/14/13
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sorts {

    public static void main(String[] args) {

        Integer[] sorts = {1,6,3,9,1,2,6,9,4,11,6};
        insertionSort(sorts);
        System.out.println(Arrays.toString(sorts));
        Integer[] sorts2 = {1,6,3,9,1,2,6,9,4,11,6};
        msort(sorts2);
        System.out.println(Arrays.toString(sorts2));
        Integer[] sorts5 = {1,6,3,9,1,2,6,9,4,11,6};
        qsort(sorts5, 0, sorts5.length);
        System.out.println(Arrays.toString(sorts5));


        int size = 99999;
        Random random = new Random();
        Integer[] sorts3 = new Integer[size];
        Integer[] sorts4 = new Integer[size];
        for(int i=0; i<size; i++) {
            Integer next = random.nextInt();
            sorts3[i] = next;
            sorts4[i] = next;
        }


        long startTime = new Date().getTime();
        insertionSort(sorts3);
        long totalTimeInsertion = new Date().getTime() - startTime;

        startTime = new Date().getTime();
        msort(sorts4);
        long totalTimeMerge = new Date().getTime() - startTime;

        boolean allMatch = true;
        for(int i=0; i<sorts3.length;i++) {
            if(!sorts3[i].equals(sorts4[i])) {
                allMatch = false;
            }
        }

        System.out.println("Insertion sort took " + totalTimeInsertion);
        System.out.println("Merge sort took " + totalTimeMerge);
        System.out.println("All match: " + allMatch);

    }

    public static <T extends Comparable<? super T>> void insertionSort(T[] arr) {
        int j = 0;
        T value;
        for(int i = 1; i < arr.length; i++) {
            value = arr[i];
            j=i;
            while(j > 0 && value.compareTo(arr[j-1]) <0) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = value;
        }
    }

    public static<T extends Comparable<? super T>> void msort(T[] arr) {
        if(arr.length == 1 || arr.length == 0) {
            return;
        } else {
            int mid = arr.length/2;
            T[] first = Arrays.copyOfRange(arr, 0, mid);
            T[] second = Arrays.copyOfRange(arr, mid, arr.length);
            msort(first);
            msort(second);
            int firstIndex = 0;
            int secondIndex = 0;
            int i = 0;
            while(firstIndex < first.length && secondIndex < second.length) {
                switch (first[firstIndex].compareTo(second[secondIndex])) {
                    case 0:
                        arr[i] = first[firstIndex];
                        firstIndex++;
                        break;
                    case -1:
                        arr[i] = first[firstIndex];
                        firstIndex++;
                        break;
                    case 1:
                        arr[i] = second[secondIndex];
                        secondIndex++;
                        break;
                }
                i++;
            }
            for(int j=firstIndex; j<first.length;j++) {
                arr[i]=first[j];
                i++;
            }
            for(int j=secondIndex;j<second.length;j++) {
                arr[i]=second[j];
                i++;
            }

        }
    }

    public static<T extends Comparable<? super T>> void qsort(T[] arr, int start, int end) {
        if(end-start <= 1) {
            return;
        } else if(end - start == 2) {
            if(arr[end-1].compareTo(arr[start])< 0) {
                T temp = arr[end-1];
                arr[end-1] = arr[start];
                arr[start] = temp;
            }
        } else {
            int pivot = (start + end)/2;
            T pivotValue = arr[pivot];
            arr[pivot] = arr[start];
            arr[start] = pivotValue;

            int up = start+1;
            int down = end-1;
            while(true) {
                while(up <= down && arr[up].compareTo(pivotValue) < 0)
                    up++;
                while(pivotValue.compareTo(arr[down]) < 0)
                    down--;
                if(up >=  down)
                    break;

                T temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;

                up++;
                down--;
            }
            arr[start] = arr[down];
            arr[down] = pivotValue;

            qsort(arr, start, pivot);
            qsort(arr, pivot+1, end);
        }
    }
}
