package com.company;

import java.util.Scanner;

public class lab3bai7 {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("=====================");
        System.out.println("1. CF");
        System.out.println("2. C");
        System.out.println("3. HDJ");
        System.out.println("4. DreamWeaver!");
        System.out.println("5. RDBMS");
        System.out.println("6. Learn Java By Example");
        System.out.println("=======================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon: ");
        byte n = sc.nextByte();
        switch (n) {
            case 1 -> System.out.println("Ban chon CF");
            case 2 -> System.out.println("Ban chon C");
            case 3 -> System.out.println("Ban chon HDJ");
            case 4 -> System.out.println("Ban chon DreamWeaver!");
            case 5 -> System.out.println("Ban chon RDBMS");
            case 6 -> System.out.println("Ban chon Learn Java By Example");
        }


    }
}
