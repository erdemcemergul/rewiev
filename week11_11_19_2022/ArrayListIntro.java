package week11_11_19_2022;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
        cities.add("London");
        cities.add("Paris");
        cities.add("İstanbul");
        cities.add("Rome");
        System.out.println(cities);
        cities.add(0,"Vienna");
        System.out.println(cities);
        System.out.println(cities.set(2,"NewYork"));
        cities.set(3,"Angara");
        System.out.println("=======After Update========");
        System.out.println(cities);
        System.out.println(cities.indexOf("NewYork"));
        System.out.println(cities.indexOf("Paris"));//get -1
        System.out.println(cities.indexOf("New")); //-1
        System.out.println(cities.lastIndexOf("London"));
        cities.add("London");
        System.out.println(cities);
        System.out.println(cities.indexOf("London"));//1
        System.out.println(cities.lastIndexOf("London"));//5

ArrayList<Integer> numbers=new ArrayList<>();
numbers.add(1);
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(4);
numbers.add(5);
numbers.add(1);
numbers.add(1);
        System.out.println(numbers);
        System.out.println(numbers.indexOf(1));//0
        System.out.println(numbers.lastIndexOf(1));//7
        ArrayList<Integer> numbers1=new ArrayList<>();
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers1.add(1);
numbers1.remove(1);//3
        System.out.println(numbers1);//2,4,5,1
        Integer b=4;
        numbers1.remove(b);        //it will your element,   2,5,1
        System.out.println(numbers1);
        numbers1.remove(new Integer(5));//2,1
        System.out.println(numbers1);

        // bulk operation
        //addAll
        System.out.println(numbers);
        //removeAll
        //RetainAll
        //removeIf


        for (Integer number :numbers             ) {
            if (number<3)
                numbers.remove(number);
        }
numbers.removeIf(p-> p<3);
        ArrayList<Integer>NUMBER3= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        //ArrayList<String>



    }}
