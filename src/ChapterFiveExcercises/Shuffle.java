package ChapterFiveExcercises;

import time.Time24;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/14/13
 * Time: 7:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Shuffle {

    public static void main(String[] args) {
        String[] strArr = {"red", "blue", "orange", "green", "black"};
        Time24[] timeArr  = {new Time24(9, 30), new Time24(19,15), new Time24(5, 45), new Time24(22,0)};
        shuffle(strArr);
        shuffle(timeArr);
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(timeArr));

        Integer[] intArr = {2,5,3,5,4,7,5,1,8,9};
        String[] strList = {"june", "joe", "glenn", "joe", "glenn"};

        System.out.println("Last index of 1: " + lastIndexOf(intArr, 0, 1));
        System.out.println("Last index of 5 from 2nd index: " + lastIndexOf(intArr, 2,5));

        System.out.println("Last index of glenn: " + lastIndexOf(strList, 0, "glenn"));
        System.out.println("Last index of bert: " + lastIndexOf(strList, 0, "bert"));

    }


    public static void shuffle(Object[] arr) {
        Random random = new Random();
        for(int i=0; i<arr.length;i++) {
            Object temp = arr[i];
            int j = Math.abs(random.nextInt()%arr.length);
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static int lastIndexOf(Object[] arr, int fromIndex, Object target) {
        int lastIndex = -1;
        for(int i = fromIndex; i < arr.length; i++) {
            if(arr[i].equals(target)) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}
