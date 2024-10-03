package com.example;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

//        4 eded goturulur. Eger 1 –ci eded ile 2-ci ededin cemi , 3 cu eded ile 4 –cu ededin ceminden boyukdurse,onda asagidaki kimi hell etmeli.
//        Lazim olan butun sertler yoxlanilmalidir.

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
