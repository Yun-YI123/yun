package com.amy;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Please enter your age");
        Scanner scanner = new Scanner(System.in);
        String s =scanner.next();
        System.out.println(s);
    }
}
