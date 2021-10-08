package PracKornevVal.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Prac3 {
    /**
     * Введите с клавиатуры число Х. Продублируйте каждый элемент массива, превосходящий х.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число Х: ");
        int x = sc.nextInt();
        int[] mas = new int[10];
        for(int i=0;i<mas.length;i++){
            mas[i]=(int)Math.round(Math.random()*10);
        }
        System.out.println(Arrays.toString(mas));
        mas = DublicateDinamic(mas,x);
        System.out.println(Arrays.toString(mas));
    }

    private static int[] Dublicate(int[] mas, int x){
        int i;
        int countAdd=0;
        for(i=0;i<mas.length;i++){
            if(mas[i]>x)
                countAdd++;
        }
        int [] res = new int[mas.length+countAdd];
        i=0;
        countAdd=0;
        while(i!=mas.length){
            if(mas[i]>x){
                res[i+countAdd]=mas[i];
                res[i+countAdd+1]=mas[i];
                countAdd++;
            }
            else{
                res[i+countAdd]=mas[i];
            }
            i++;
        }
        return res;
    }

    private static int[] DublicateDinamic(int[]mas, int x){
        int[] res = new int[mas.length];
        int i=0;
        int countDublicate=0;
        while (i!=mas.length){
            if(mas[i]>x){
                countDublicate++;
                if((i+countDublicate)>=res.length){
                    res = copy(res,2);
                    res[i+countDublicate-1]=mas[i];
                    res[i+countDublicate]=mas[i];
                }else{
                    res[i+countDublicate-1]=mas[i];
                    res[i+countDublicate]=mas[i];
                }
            }
            else {
                if ((i + countDublicate) >= res.length) {
                    res = copy(res, 1);
                    res[i + countDublicate] = mas[i];
                } else {
                    res[i + countDublicate] = mas[i];
                }
            }
            i++;
        }
        return res;
    }

    private static int[] copy(int[]mas, int c){
        int [] tmp = new int[mas.length+c];
        for(int i=0;i<mas.length;i++){
            tmp[i]=mas[i];
        }
        return tmp;
    }
}
