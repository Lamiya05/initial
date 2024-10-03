package com.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a, b, c, d, cem1, cem2;
        Scanner input = new Scanner(System.in);

        System.out.print("A= ");
        a = input.nextInt();

        System.out.print("B= ");
        b = input.nextInt();

        System.out.print("C= ");
        c = input.nextInt();

        System.out.print("D= ");
        d = input.nextInt();

        cem1 = a + b;
        cem2 = c + d;

        if (cem1 > cem2){
            System.out.println(a + " ile " + b +"-un cemi "+ c + " ile "+ d+"-in ceminden boyukdur.");
        }else if (cem1 == cem2) {
            System.out.print(a + " ile " + b +"-un cemi "+ c + " ile "+ d+"-in cemine beraberdir.");
        } else {
            System.out.print(a + " ile " + b + "-un cemi " + c + " ile " + d + "-in ceminden Kicikdir.");
        }
    }
}