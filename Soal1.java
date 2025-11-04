/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author alfiandi
 */
public class Soal1 {

    public static void main(String[] args) {
        Locale indonesia = new Locale("id", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(indonesia);
        Scanner input = new Scanner(System.in);

//        Soal 1 bagian a
        System.out.println("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.println("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.println("Masukkan panjang  (cm): ");
        double panjang = input.nextDouble();

        System.out.println("Masukkan lebar  (cm): ");
        double lebar = input.nextDouble();

        System.out.println("Masukkan tinggi  (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;
        double tarif = (jarak <= 10) ? 4250 : 6000;
        double total = berat * tarif + (volume > 100 ? 50000 : 0);

        String totalInRupiah = formatRupiah.format(total);

        System.out.println(totalInRupiah);

//        Soal 1 bagian b 
        hitungGenapGanjil();
    }

    static String hitungGenapGanjil() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();
        System.out.println((bilangan % 2 == 0) ? "Ini adalah bilangan genap" : "Ini adalah bilangan ganjil");
        return null;
    }
}
