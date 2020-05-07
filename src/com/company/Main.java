package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите первую сторону треугольника");
        Scanner scan1=new Scanner(System.in);
        int a=scan1.nextInt();

        System.out.println("Введите вторую сторону треугольника");
        Scanner scan2=new Scanner(System.in);
        int b=scan2.nextInt();

        System.out.println("Введите третью сторону треугольника");
        Scanner scan3=new Scanner(System.in);
        int c=scan3.nextInt();

        if ((a+b>c) && (b+c>a) && (a+c>b)) {
            System.out.println("Такой треугольник существует");
        } else {
            System.out.println("Такой треугольник не существует");
        }

    }
}
