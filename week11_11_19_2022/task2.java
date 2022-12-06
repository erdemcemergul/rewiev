package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        ArrayList <Integer> array1=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList <Integer> array2=new ArrayList<>(Arrays.asList(4,5,6));
        Integer[] merge=mergeIntoArray(array1,array2);
        System.out.println(Arrays.toString(merge));


    }
    public static Integer[] mergeIntoArray(ArrayList<Integer>array1, ArrayList<Integer> array2){

        Integer[] result=new Integer[array1.size()+array2.size()];
        int index=0;
        for (Integer each:array1             ) {
            result[index++]=each;
        }

        System.out.println(index);


        for (Integer integer : array2        ) {
            result[index++]=integer;

        }

        return result;

    }
}








/*Create a method that get two arraylists as a parameters the return the array which has contains all elements in it.

input:

first arraylist :1,2,3

second arraylist :4,5,6

output:

1,2,3,4,5,6
*/