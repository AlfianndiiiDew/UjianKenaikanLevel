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
public class Soal2b2 {

    static double volumeTabung(double jari, double tinggi) {
        return Math.PI * jari * jari * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
