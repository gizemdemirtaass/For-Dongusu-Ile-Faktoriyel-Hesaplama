package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.print("Lütfen sayı giriniz : ");
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    long faktoriyel = 1;
    for(int i=1; i<=num; i++){
        faktoriyel *= i;
    }
    System.out.println(faktoriyel + " Faktöriyelin Sonucudur\n");
    }
}
