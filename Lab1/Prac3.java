package PracKornevVal.Lab1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Prac3 {
    /**
     * С клавиатуры вводятся 4 числа a,b,c,d. Определить удовлетворяют ли элементы полседовательности рекуррентному соотношению
     * axk + bxk1 + cxk2 =d.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четыре числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        try{
            BufferedReader rd = new BufferedReader(new FileReader("C:\\Users\\79219\\IdeaProjects\\TEST\\src\\PracKornevVal\\Posled.txt"));
            String s;
            int pred0=0;
            int pred1=0;
            int pred2=0;
            int counter=0;
            boolean flag =true;
            while ((s=rd.readLine())!=null){
                if(counter==0)
                    pred0 = Integer.parseInt(s);
                else if(counter==1)
                    pred1 = Integer.parseInt(s);
                else if(counter==2)
                    pred2=Integer.parseInt(s);
                else{
                    if(((a*pred0)+(b*pred1)+(c*pred2)) != d){
                        flag=false;
                        break;
                    }
                    else{
                        pred0=pred1;
                        pred1=pred2;
                        pred2=Integer.parseInt(s);
                    }
                }
                counter++;
            }
            if(flag)
                System.out.println("Удовлетворяет");
            else
                System.out.println("Не удовлетворяет");
        }
        catch (java.io.FileNotFoundException ex){
            System.out.println("File not found");
        }
        catch (java.io.IOException ex){
            System.out.println("Trouble with read from file");
        }
    }
}
