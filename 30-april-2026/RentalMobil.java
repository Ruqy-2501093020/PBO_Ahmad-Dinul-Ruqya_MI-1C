/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rentalmobil;

/**
 *
 * @author LAB-SI-PC
 */
public class RentalMobil {
    private String idSewa;
    private String namaPenyewa;
    private String jenisMobil;
    private int lamaSewa;
    private double hargaSewa;
    private double biayaSewa;
    private double biayaTambahan;
    private double totalBayar;

    // Getter dan Setter
    public String getIdSewa() {
        return idSewa;
    }

    public void setIdSewa(String idSewa) {
        this.idSewa = idSewa;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
    }

    public String getJenisMobil() {
        return jenisMobil;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public double getBiayaSewa() {
        return biayaSewa;
    }

    public double getBiayaTambahan() {
        return biayaTambahan;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    // Method untuk hitung
    public void hitungData() {
        // Menentukan harga sewa
        switch (jenisMobil.toLowerCase()) {
            case "avanza":
                hargaSewa = 300000;
                break;
            case "innova":
                hargaSewa = 500000;
                break;
            case "fortuner":
                hargaSewa = 800000;
                break;
            default:
                hargaSewa = 0;
                System.out.println("Jenis mobil tidak dikenali!");
        }

        // Hitung biaya sewa
        biayaSewa = hargaSewa * lamaSewa;

        // Hitung diskon
        if (lamaSewa > 5) {
            biayaTambahan = 0.1 * biayaSewa;
        } else {
            biayaTambahan = 0;
        }

        // Total bayar
        totalBayar = biayaSewa - biayaTambahan;
    }

    // Tampilkan data
    public void tampilkanData() {
        System.out.println("ID Sewa       : " + getIdSewa());
        System.out.println("Nama Penyewa  : " + getNamaPenyewa());
        System.out.println("Jenis Mobil   : " + getJenisMobil());
        System.out.println("Lama Sewa     : " + getLamaSewa() + " hari");
        System.out.println("Harga Sewa    : Rp " + getHargaSewa());
        System.out.println("Biaya Sewa    : Rp " + getBiayaSewa());
        System.out.println("Diskon        : Rp " + getBiayaTambahan());
        System.out.println("Total Bayar   : Rp " + getTotalBayar());
    }
}

