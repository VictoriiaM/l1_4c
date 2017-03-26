import java.util.Scanner;

/**
 * Created by pilot on 26.03.2017.
 */

public class Main {
    public static void main (String[]args){
        System.out.println("\n Лекция 1. Д/з 4с \n");
        System.out.println("Введите x:");
        Scanner scanner=new Scanner(System.in);
        double x=scanner.nextDouble();
        double ans;

        ans = x-Math.pow(x,3)/3+Math.pow(x,5)/5;


        System.out.println("ans="+ans);

    }
}
