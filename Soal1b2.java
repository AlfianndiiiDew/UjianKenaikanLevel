package com.mycompany.mavenproject1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alfiandi
 */
public class Soal1b2 {
    
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("\n\n Program soal 1.2");
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();
        System.out.println((bilangan % 2 == 0) ? "Ini adalah bilangan genap" : "Ini adalah bilangan ganjil");
     }
}
