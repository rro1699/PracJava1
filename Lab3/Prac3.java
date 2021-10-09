package PracKornevVal.Lab3;

import java.util.Arrays;

public class Prac3 {
    /**
     * Сортировка вставками с бинарным поиском.
     */
    public static void main(String[] args) {
        int[] mas = new int[10];
        for(int i=0;i<mas.length;i++){
            mas[i]=(int)Math.round(Math.random()*10);
        }
        System.out.println(Arrays.toString(mas));
        mas = Sort(mas);
        System.out.println(Arrays.toString(mas));
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
    }

    private static int[] Sort(int[]mas){
        for(int i=0;i<mas.length;i++){
            int index = FindIndex(mas,0,i,mas[i]);
            int tmp = mas[i];
            for(int j=i;j>index;j--){
                mas[j]=mas[j-1];
            }
            mas[index]=tmp;
        }
        return mas;
    }

    private static int FindIndex(int [] mas, int start, int end, int x){
        if(end<start){
            return end+1;
        }else {
            int sred = (end+start)/2;
            if(x==mas[sred]) {
                return sred;
            }
            else if(x<mas[sred]){
                return FindIndex(mas,start,sred-1,x);
            }else{
                return FindIndex(mas,sred+1,end,x);
            }
        }
    }
}
