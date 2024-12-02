import java.util.Scanner;

import static java.lang.Math.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите А=");
        double A = in.nextDouble();
        System.out.print("Введите B=");
        double B = in.nextDouble();
        System.out.print("Введите H=");
        double H = in.nextDouble();
        double x = floor(A*100.0)/100.0;
        double y;
        while (x <= B) {
            if (sin(x/2)<=0)
                System.out.printf("при х=%.1f под знаком логарифма недопустимое значение\n", x);
            else {
                y = exp(1.0 / 3.0 * log(abs(6 * pow(x, 2) - pow(x, 3))));
                System.out.printf("при х=%.1f y=%.3f\n", x, y);
            }
            x = x + H;
       }
        //Scanner in = new Scanner(System.in);
        //System.out.print("Введите А=");
        //double A = in.nextDouble();
        //System.out.print("Введите B=");
        //double B = in.nextDouble();
        //System.out.print("Введите H=");
        //double H = in.nextDouble();
        //double x = floor(A * 100.0) / 100.0;
        //double y;
        //do {
            //if (sin(x/2)<=0)
                //System.out.printf("при х=%.1f под знаком логарифма недопустимое значение\n", x);
            //else {
                //y = exp(1.0 / 3.0 * log(abs(6 * pow(x, 2) - pow(x, 3))));
                //System.out.printf("при х=%.1f y=%.3f\n", x, y);
            //}
           //x = x + H;
        //}
        //while (x <= B);
    }
}
