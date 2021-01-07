package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Moi nhap ung vien so 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho Ten: ");
        String name = sc.nextLine();
        System.out.print("Gioi tinh: ");
        char sex = sc.next().charAt(0);
        System.out.print("Nam Sinh: ");
        int yearOfBirth = sc.nextInt();
        System.out.print("Chieu cao: ");
        double height = sc.nextDouble();
        System.out.print("Que quan: ");
        String birthPlace = sc.nextLine();
        sc.nextLine();
        System.out.print("Chuyen nganh: ");
        String major = sc.nextLine();
        System.out.print("Diem TB: ");
        float gpa = sc.nextFloat();

        String hoten = "Ho ten";
        String namsinh= "Nam Sinh";
        String gioitinh = "Gioi Tinh";
        String chieucao = "C.cao";
        String cannang = "C.nang";
        String quequan = "Que quan";
        String cnganh = "C.nganh";
        String dtb = "DTB";
        String newname = "Nguyen Van A";
        String year = "1998";
        String sexx = "F";
        String heights = "1.62";
        String weights = "52";
        String pob = "TP.Ho Chi Minh";
        String maj = "Thiet Ke";
        String gpaa = "7.5";
        byte stt1 = 1;
        String sf = String.format("STT%10s%20s%10s%10s%10s%15s%20s%15s",hoten,namsinh,gioitinh,chieucao,cannang,quequan,cnganh,dtb);
        System.out.println(sf);
        System.out.println("============================================================================================================================");
        String format = String.format("%-10s%-20s%-10s%-10s%-10s%-10s%-15s%-20s%-15s",stt1,newname,year,sexx,heights,weights,pob,maj,gpaa);
        System.out.println(format);

    }
}
