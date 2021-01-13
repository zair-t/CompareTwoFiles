package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int quentOfDiff = 0;
        try {
            File firstFile = new File("first.txt");
            File secondFile = new File("second.txt");
            FileInputStream in1 =  new FileInputStream("first.txt");
            FileInputStream in2 =  new FileInputStream("second.txt");
            String name = (firstFile.length()>secondFile.length())? firstFile.getPath(): secondFile.getPath();
            FileInputStream in = new FileInputStream(name);
            char ch1;
            char ch2;
            int finish;
            while((finish = in.read())!= -1){
                ch1 = (char) in1.read();
                ch2 = (char) in2.read();
                if(ch1 != ch2) {
                    System.out.println(ch1 + " " + ch2);
                    quentOfDiff++;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
       System.out.println("Количество различий: "+quentOfDiff);
    }
}
