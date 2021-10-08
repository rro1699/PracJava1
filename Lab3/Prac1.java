package PracKornevVal.Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Prac1 {
    /**
     * Пусть дан массив. Все элементы массивы не убывают. С клавиатуры вводится Х.
     * С помощью бинарного поиска определить принадлежит ли элемент Х массиву.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Х: ");
        int x = sc.nextInt();
        int [] mas = new int[100];
        for(int i=0;i<mas.length;i++){
            mas[i]=(int)Math.round(Math.random()*100);
        }
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
        System.out.println(isInsert(mas,0,mas.length-1,x));
    }

    private static boolean isInsert(int [] mas, int start, int end, int x){
        if(end<start){
            return false;
        }else {
            int sred = (end+start)/2;
            if(x==mas[sred])
                return true;
            else if(x<mas[sred]){

                return isInsert(mas,start,sred-1,x);
            }else{

                return isInsert(mas,sred+1,end,x);
            }
        }
    }


}
