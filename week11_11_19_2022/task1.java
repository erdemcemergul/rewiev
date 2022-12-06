package week11_11_19_2022;
import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {

int[] arr = {2,3,4,5,6,8,9};

        ArrayList<Integer> list1 = new ArrayList<>( convertArrayToArrayList(arr) );


            System.out.print(list1);



    }


    public static ArrayList<Integer>  convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            if (each%3==0)
            list.add(each);
        }

        return list;
    }
    }






/*Task 1 :

Create a method that which is get array list as a parameter then return the numbers which are divisible by 3.

input:

  numbers : 2,3,4,5,6,8,9

output:

3,6,9*/