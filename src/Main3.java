import java.util.Scanner;

/**
 * Created by pilot on 26.03.2017.
 */
public class Main3 {
    public static void main (String[]args){
        System.out.println("\n Лекция 1. Д/з 4f \n");
        System.out.println ("ans=sin√x+1-sin√x-1");
        System.out.println("Введите x:");
        Scanner scanner=new Scanner(System.in);
        double x=scanner.nextDouble();
        double y;
        double z;
        double ans;
        double a;

        y=Math.sqrt(x+1);
        z=Math.sqrt(x-1);

        ans = Math.sin(y)-Math.sin(z);
        a=Math.sin(Math.sqrt(x+1))-Math.sin(Math.sqrt(x-1));

        System.out.println("ans="+ans);
        System.out.println("a="+a);


    }
}
