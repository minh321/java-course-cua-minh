package com.company;

import java.util.Scanner;

public class lab2bai6 {
    public static void main(String[] args) {
        boolean isVowel = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ky tu: ");
        char kytu = sc.next().charAt(0);
        sc.close();
        switch (kytu) {
            case 'a':
            case 'i':
            case 'e':
            case 'u':
            case 'o':
            case 'A':
            case 'I':
            case 'E':
            case 'O':
            case 'U': isVowel = true;
        }
        if (isVowel == true) {
            System.out.println(kytu + " la nguyen am");
        } else {
            if ((kytu >= 'a' && kytu <= 'z') || (kytu >= 'A' && kytu <= 'Z')) {
                System.out.println(kytu + " la phu am");
            } else {
                System.out.println(kytu + " khong la ky tu alphabet");
            }
        }


    }
}