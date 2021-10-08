package PracKornevVal.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Prac1 {
    /**
     * Дан массив. Каждый элемент (кроме 1 и последнего) массива заменить на полусумму соседних.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = sc.nextInt();
        int [] mas = new int[n];
        for(int i=0;i<mas.length;i++){
            mas[i]=i*i;
        }
        System.out.println(Arrays.toString(mas));
        mas = PolySum(mas);
        System.out.println(Arrays.toString(mas));
    }

    private static int[] PolySum(int[]mas){
        int [] res = new int[mas.length];
        res[0]=mas[0];
        res[mas.length-1]=mas[mas.length-1];
        for(int i=1;i<res.length-1;i++){
            res[i]=(mas[i-1]+mas[i+1])/2;
        }
        return res;
    }
}
