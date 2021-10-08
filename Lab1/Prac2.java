package PracKornevVal.Lab1;

import java.io.*;


public class Prac2 {
    /**
     * Написать программу для проверки является ли последовательность геометрической прогрессии.
     */
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\79219\\IdeaProjects\\TEST\\src\\PracKornevVal\\Posled.txt"));
            String c;
            int count=0;
            int pred=0;
            int q=0;
            boolean flag =true;
            while((c = br.readLine())!=null){
                if(count==0){
                   pred = Integer.parseInt(c);
                }
                else if(count == 1){
                    int tmp = Integer.parseInt(c);
                    q = tmp/pred;
                    pred = tmp;
                }
                else if(Integer.parseInt(c) != pred*q){
                    flag=false;
                    break;
                }
                pred = Integer.parseInt(c);
                count++;
            }
            if(flag)
                System.out.println("Последовательность является прогрессией");
            else
                System.out.println("Последовательность не является прогрессией");
        }
        catch (java.io.FileNotFoundException ex){
            System.out.println("File not found");
        }
        catch (java.io.IOException ex){
            System.out.println("Trouble with read from file");
        }

    }

}
