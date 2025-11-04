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

public class Soal3 {

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

//        Soal 3.2
        System.out.println("\n\n\n\nJawaban Soal 3.2\n");

        System.out.print("Jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Jumlah kolom: ");
        int kolom = sc.nextInt();

        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];

        System.out.println("\n--- INPUT MATRIKS 1 ---");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks 1 - Baris " + (i + 1) + " Kolom " + (j + 1) + ": ");
                matriks1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--- INPUT MATRIKS 2 ---");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks 2 - Baris " + (i + 1) + " Kolom " + (j + 1) + ": ");
                matriks2[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\n====== HASIL ======\n");

        System.out.println("Matriks 1:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriks 2:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nHasil Penjumlahan:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                int hasil = matriks1[i][j] + matriks2[i][j];
                System.out.print(hasil + "\t");
            }
            System.out.println();
        }

        sc.close();

    }
}
