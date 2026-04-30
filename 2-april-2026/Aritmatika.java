/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author LAB-SI-PC
 */
public class Aritmatika {
    int tambah(int a, int b){
        int c = a+b;
        return c;
    }
 
    int bilgan(int a, int b){
        int c = a+b;
        if(c % 2 != 0){
         System.out.println("ganjil");
        } else{
          System.out.println("genap");
        }
        return c;
}
    
public static void main(String[] args){
        Aritmatika aritmatika = new Aritmatika();
        int a = aritmatika.tambah(12,10);
        System.out.println("hasil "+ a);
        int b = aritmatika.bilgan(12,10);
    }
}