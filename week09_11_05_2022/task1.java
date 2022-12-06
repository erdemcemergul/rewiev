package week09_11_05_2022;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int z=num.nextInt();
        oddOrEven(z);

    }
    public static void oddOrEven(int a){
        if (a%2==0)
            System.out.println("even");
        else
            System.out.println("odd");



    }
}
