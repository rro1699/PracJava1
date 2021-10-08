package PracKornevVal.Lab1;

import java.util.Scanner;

public class Prac4 {
    /**
     * Дана последовательность чисел, которая является коэффициентами многочлена, расположенными в порядке убывания.
     * С клавиатуры вводится число Х. Вычислить значение многочлена и его производной в точке Х.
     */
    private static int [] mas;
    private static double [] D;
    private static double [] P;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число Х: ");
        double x = sc.nextDouble();
         mas = new int[] {1,2,1};
         D = new double[mas.length];
         P = new double[mas.length];
         Recur(mas.length-1,x,0);
        System.out.println("Производная равна - "+D[0]);
        System.out.println("Значение многочлена равно - "+P[0]);
    }

    public static void Recur(int k,double x,int c){
        if(k==0) {
            P[c] = mas[mas.length - 1];
            D[c] = 0.0;
        }
        else{
            Recur(k-1,x,c+1);
            P[c] = x*P[c+1]+mas[c];
            D[c] = P[c+1] + x*D[c+1];
        }
    }
}
