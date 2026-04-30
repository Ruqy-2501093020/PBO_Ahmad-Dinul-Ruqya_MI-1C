/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruqy160426;

/**
 *
 * @author LAB-SI-PC
 */
public class BukuAlamatExample {
    public static void main(String[] args){
       DataBukuAlamat data = new DataBukuAlamat();
       BukuAlamat bukuAlamat = new BukuAlamat();
       bukuAlamat.setNama("Ali");
       bukuAlamat.setAlamat("Padang");
       bukuAlamat.setNomorTelepon("0878254364");
       bukuAlamat.setAlamatEmail("ali@coba.com");
       data.insert(bukuAlamat, 0);
       bukuAlamat = new BukuAlamat(); 
       bukuAlamat.setNama("Budi");
       bukuAlamat.setAlamat("Padang");
       bukuAlamat.setNomorTelepon("0876752390");
       bukuAlamat.setAlamatEmail("budi@coba.com");
       data.insert(bukuAlamat, 1);
       data.View();
    }
}
