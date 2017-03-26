import java.util.Scanner;

/**
 * Created by pilot on 26.03.2017.
 */
public class Main2 {
    public static void main (String[]args){
        System.out.println("\n Лекция 1. Д/з 4d \n");
        System.out.println ("(x+y)/(y+1)-(xy-12)/(34+x)");
        System.out.println("Введите x и y:");
        Scanner scanner=new Scanner(System.in);
        double x=scanner.nextDouble();
        double y=scanner.nextDouble();
        double ans;

        ans = (x+y)/(y+1)-(x*y-12)/(34+x);


        System.out.println("ans="+ans);

    }
}
