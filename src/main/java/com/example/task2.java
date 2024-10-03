package com.example;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

//        4 eded goturulur. Bu ededlerin tek  ve ya cut olmasini yoxlayin. Lazim olan butun sertler

        int a, b, c, d;
        Scanner input = new Scanner(System.in);

        System.out.print("A= ");
        a = input.nextInt();

        System.out.print("B= ");
        b = input.nextInt();

        System.out.print("C= ");
        c = input.nextInt();

        System.out.print("D= ");
        d = input.nextInt();

        if (a == 0) {
            System.out.println("A ne tekdir ne cut");
        } else if (a % 2 == 0) {
            System.out.println("A cutdur");
        } else {
            System.out.println("A tekdir");
        }

        if (b == 0) {
            System.out.println("B ne tekdir ne cut");
        } else if (b % 2 == 0) {
            System.out.println("B cutdur");
        } else {
            System.out.println("B tekdir");
        }

        if (c == 0) {
            System.out.println("C ne tekdir ne cut");
        } else if (c % 2 == 0) {
            System.out.println("C cutdur");
        } else {
            System.out.println("C tekdir");
        }

        if (d == 0) {
            System.out.println("D ne tekdir ne cut");
        } else if (d % 2 == 0) {
            System.out.println("D cutdur");
        } else {
            System.out.println("D tekdir");
        }
    }
}


//  basqa yolla

//        System.out.print("A= ");
//        int a = input.nextInt();
//
//        System.out.print("B= ");
//        int b = input.nextInt();
//
//        System.out.print("C= ");
//        int c = input.nextInt();
//
//        System.out.print("D= ");
//        int d = input.nextInt();
//
//        // Tək/cüt yoxlaması və nəticə çapı
//        System.out.println(a == 0 ? "A ne tekdir ne cut" : (a % 2 == 0 ? "A cutdur" : "A tekdir"));
//        System.out.println(b == 0 ? "B ne tekdir ne cut" : (b % 2 == 0 ? "B cutdur" : "B tekdir"));
//        System.out.println(c == 0 ? "C ne tekdir ne cut" : (c % 2 == 0 ? "C cutdur" : "C tekdir"));
//        System.out.println(d == 0 ? "D ne tekdir ne cut" : (d % 2 == 0 ? "D cutdur" : "D tekdir"));
