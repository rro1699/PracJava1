package PracKornevVal.Lab2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Prac2 {
    /**
     * Введити с клавиатуры число Х и удалите из массива все элементы, превосходящие Х, а остальные уплотните.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число Х: ");
        int x = sc.nextInt();
        int [] mas = new int[10];
        for(int i=0;i<mas.length;i++){
            mas[i] = (int) Math.round(Math.random()*10);
        }
        System.out.println(Arrays.toString(mas));
        mas = Delete(mas,x);
        System.out.println(Arrays.toString(mas));
    }

    private static int[] Delete(int[] mas,int x){
        int countUdal =0;
        int i=0;
        while(i!=mas.length-countUdal){
            if(mas[i]>x){
                for(int j=i;j<mas.length-1-countUdal;j++){
                    mas[j]=mas[j+1];
                }
                countUdal++;
            }
            else{
                i++;
            }
        }
        int[] res = new int[mas.length-countUdal];
        for(i=0;i<res.length;i++){
            res[i]=mas[i];
        }
        return res;
    }
}
