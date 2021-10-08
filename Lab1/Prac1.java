package PracKornevVal.Lab1;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        /**
         * Написать программу, которая вычисляет среднее арифметическое элементов числовой последовательности, вводимых с клавиатуры.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите числа\nВ конце последовательности введите любую букву");
        int srValue=0;
        int count =0;
        while(sc.hasNextInt()){
            srValue += sc.nextInt();
            count++;
        }
        if(count!=0)
            System.out.println("Среднее значение = "+((double)srValue/count));
        else
            System.out.println("Среднее значение = 0");
    }
}
