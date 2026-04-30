/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalmobil;

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;

public class MainRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RentalMobil rm = new RentalMobil();

        System.out.print("ID Sewa: ");
        rm.setIdSewa(input.nextLine());

        System.out.print("Nama Penyewa: ");
        rm.setNamaPenyewa(input.nextLine());

        System.out.print("Jenis Mobil (Avanza/Innova/Fortuner): ");
        rm.setJenisMobil(input.nextLine());

        System.out.print("Lama Sewa (hari): ");
        rm.setLamaSewa(input.nextInt());

        // Hitung
        rm.hitungData();

        // Output
        System.out.println("\n=== DATA RENTAL ===");
        rm.tampilkanData();
    }
}
    
