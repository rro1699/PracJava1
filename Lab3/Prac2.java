package PracKornevVal.Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Prac2 {
    /**
     * Пусть дан массив. Все элементы массивы не убывают. С клавиатуры вводится Х.
     * С помощью бинарного поиска определить принадлежит ли элемент Х массиву.
     * Кроме этого, должна быть определена позиция Х в массиве, либо позиция в которую его нужно поставить.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Х: ");
        int x = sc.nextInt();
        int [] mas = new int[10];
        for(int i=0;i<mas.length;i++){
            mas[i]=(int)Math.round(Math.random()*10);
        }
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
        N a = new N();
        isInsert(mas,0,mas.length-1,x,a);
        if(a.insert){
            System.out.println("Принадлежит, в позиции:  "+a.index);
        }else{
            System.out.println("Не принадлежит, нужно поставить в позицию: "+a.index);
        }
    }

    private static void isInsert(int [] mas, int start, int end, int x, N a){
        if(end<start){
            a.insert=false;
            a.index=end+1;
        }else {
            int sred = (end+start)/2;
            if(x==mas[sred]) {
                a.insert=true;
                a.index=sred;
            }
            else if(x<mas[sred]){
                isInsert(mas,start,sred-1,x,a);
            }else{
                isInsert(mas,sred+1,end,x,a);
            }
        }
    }
    private static class N{
        private int index;
        private boolean insert;
        N(){
            index=-1;
            insert=false;
        }
    }

}
