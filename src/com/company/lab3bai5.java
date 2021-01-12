package com.company;

import java.util.Scanner;

public class lab3bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so km: ");
        float km = sc.nextFloat();
        long money = 0;
        final int STARTING_FEE = 15000;
        final int NEXT_TO_5KM = 13500;
        final int FROM_5KM_ONWARDS = 11000;
        if(km <= 1) {
            money = STARTING_FEE;

        }else if(km >= 1 && km <=5) {
            money = (long) (STARTING_FEE + NEXT_TO_5KM * (km-1));
        }else if(km > 5 && km <= 120){
            money = (long) (STARTING_FEE + 13500 * (5-1) + 11000 * (km - 5 - 1));
        }else {
            if (km > 120){
                money = (long) (STARTING_FEE + 13500 * (5-1) + FROM_5KM_ONWARDS * (km - 5 - 1)*90/100);
            }
        }
        System.out.println("so tien di " + km + "km = " + money + " dong");


    }
}
