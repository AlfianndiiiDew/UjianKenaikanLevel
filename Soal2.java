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
public class Soal2 {

    static long faktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    static double volumeTabung(double jari, double tinggi) {
        return Math.PI * jari * jari * tinggi;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
//            soal 2.1
            System.out.println("jawaban Soal 2.1\n\n");
            System.out.println("Masukkan Bilangan Bulat Positif: ");
            int n = input.nextInt();
            System.out.println("Faktorial dari " + n + " = " + faktorial(n));
            
            System.out.println("\n\n\n\n\n");
            
//            soal 2.2
            
            System.out.println("jawaban Soal 2.2\n\n");
            System.out.println("Masukkan Jari-jari tabung: ");
            double r = input.nextDouble();
            System.out.println("Masukkan Tinggi tabung: ");
            double t = input.nextDouble();
            System.out.println("volume Tabung = " + volumeTabung(r, t));
            
            input.close();
        }
        
    }

}
