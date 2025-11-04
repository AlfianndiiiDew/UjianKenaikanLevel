/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author alfiandi
 */
import java.util.Scanner;

public class Soal3b1 {

    public static void main(String[] args) {
//          Soal 3.1

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n\n\n\nJawaban Soal 3.1 \n");


        System.out.println("Masukkan Jumlah Siswa : ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Tidak ada daftar siswa");
            return;
        }

        double total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Masukkan Nilai siswa ke-" + i + ": ");
            total += sc.nextDouble();
        }

        System.out.printf("\nTotal: %.2f | Rata-rata: %.2f%n", total, total / n);

        sc.close();

    }
}
