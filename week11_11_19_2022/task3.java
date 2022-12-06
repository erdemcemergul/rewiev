package week11_11_19_2022;

import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {
        int[] arraya={1,2,3,4,5};
        int[] arrayb={4,5,6};
        ArrayList<Integer> list = new ArrayList<>();
     ArrayList<Integer> result=   merge(arraya,arrayb);
        for (int each :result) {
            if( result.indexOf(each ) == result.lastIndexOf(each) ){
                list.add(each);
            }
        }

        System.out.println(list);
    }


    public static ArrayList<Integer> merge(int[] array1, int[] array2){
        ArrayList<Integer> list = new ArrayList<>();

list.addAll(convertArrayToArrayList(array1));
list.addAll(convertArrayToArrayList(array2));
            return list;
        }
    public static ArrayList<Integer>  convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;
    }


    }



/*Create a method that get two arrays as a parameters then return the arraylist which has contains unique elements in it.

first array :1,2,3,4,5

second array :4,5,6

output:

1,2,3,4,5,6 */