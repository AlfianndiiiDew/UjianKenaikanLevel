/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author alfiandi
 */
public class Soal2b1 {

    static long faktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }


    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
//            soal 2.1
            System.out.println("jawaban Soal 2.1\n\n");
            System.out.println("Masukkan Bilangan Bulat Positif: ");
            int n = input.nextInt();
            System.out.println("Faktorial dari " + n + " = " + faktorial(n));
            input.close();
        }
        
    }

}
