package com.example;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

//        Klavaturtadan 3 eded daxil edirsen .a,b,c.
//        Eger (a+b)/c<10 capa verirsenki a ile b-nin ceminin c -ye bolunmesi 10-dan kicikdir ,
//        eger (a+b)/c=10  capa verirsenki a ile b-nin ceminin c -ye bolunmesi 10-a beraberdir ,
//        eger (a+b)/c>10  capa verirsenki a ile b-nin ceminin c -ye bolunmesi 10-dan boyukdur.

        int a, b, c;
        double n1;
        Scanner input = new Scanner(System.in);

        System.out.print("A= ");
        a = input.nextInt();

        System.out.print("B= ");
        b = input.nextInt();

        System.out.print("C= ");
        c = input.nextInt();

        n1 = (a + b) / c;

        if (n1 < 10){
            System.out.println("a ile b-nin ceminin c -ye bolunmesi 10-dan kicikdir");
        } else if (n1 == 10) {
            System.out.println("a ile b-nin ceminin c -ye bolunmesi 10-a beraberdir");
        }else {
            System.out.println("a ile b-nin ceminin c -ye bolunmesi 10-dan boyukdur.");
        }


    }
}
