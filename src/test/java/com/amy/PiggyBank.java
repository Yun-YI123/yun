package com.amy;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import  java.io.FileNotFoundException;
import java.io.IOException;

public class PiggyBank {
    public static void main(String[] args) {
        int sum = 0 ;
        while(true) {
            try {
                FileReader fr = new FileReader("money.txt");
                sum = fr.read();
                while (true) {
                    System.out.println(sum);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            while (true) {
                System.out.println("Save money?");
                Scanner scanner1 = new Scanner(System.in);
                String yn = scanner1.nextLine();
                if (yn.equalsIgnoreCase("y")) {
                    System.out.println("You Can Save Money");
                    Scanner scanner2 = new Scanner(System.in);
                    int d = scanner2.nextInt();
                    while (d == 1 || d == 5 || d == 10) {
                        sum = sum + d;
                        System.out.println(sum);
                        break;
                    }
                } else {
                    System.out.println("finshed! Can continue to save money!!");
                    break;
                }
            }

            try {
                FileWriter fw = new FileWriter("money");
                fw.write(sum);
                fw.flush();
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

