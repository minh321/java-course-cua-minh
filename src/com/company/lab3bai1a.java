package com.company;

import java.util.Scanner;

public class lab3bai1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b == 0){
            System.out.println("Error: divide bye zero");
        }else {
            int c = a/b;
            System.out.println(c);
        }


    }
}
