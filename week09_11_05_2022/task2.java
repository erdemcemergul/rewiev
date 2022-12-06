package week09_11_05_2022;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int z=num.nextInt();
       primeNumber(z);
    }
    public static void primeNumber(int a){
        if (a==2||a==3||a==5)
            System.out.println(a +" prime");
       else if (a%2==0||a%3==0||a%5==0)
            System.out.println(a +" not prime");
        else
                System.out.println(a +" prime");

}

}
