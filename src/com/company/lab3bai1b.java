package com.company;

import java.util.Scanner;

public class lab3bai1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 2;
        int r = n%m;
        if(r == 0){
            System.out.println("N is NOT a prime number");
        }else {
            if(m < n-1){
                m = m + 1;
            }else{
                System.out.println("N is a prime number");
            }
        }

    }
}
