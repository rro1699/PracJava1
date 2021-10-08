package PracKornevVal.Lab1;


import java.io.*;

public class Prac5 {
    /**
     * Написать программу, которая копирует содержимое одного файла в другой, за исключением символов,
     * содержащихся в заданной текстовой строке.
     */

    public static void main(String[] args) {
        try {
            String filter = "And";
            BufferedReader rd = new BufferedReader(new InputStreamReader(new FileInputStream("Hello.txt")));
            String s;
            String [] tmp;
            FileWriter wr = new FileWriter(new File("out.txt"));
            while((s = rd.readLine()) != null){
                tmp = s.split(" ");
                for (String s1: tmp) {
                    if(!s1.equals(filter)){
                        wr.write(s1+" ");
                    }
                }
                wr.write("\n");
            }
            wr.close();
            rd.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
