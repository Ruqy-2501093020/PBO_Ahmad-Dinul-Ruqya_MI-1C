/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author LAB-SI-PC
 */
import javax.swing.JOptionPane;
import java.io.*;
public class NomorTerbesar {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int[] nomor = new int[10];
        int besar = 0;
        
        for(int i = 0; i<10; i++){
            String input = JOptionPane.showInputDialog("masukkan angka sebanyak 10 kali =");
            nomor[i] = Integer.parseInt(input);
            
            if(i == 0){
                besar = nomor[i];
            } else{
                if (nomor[i]>besar){
                    besar = nomor[i];
                }
            }
        }
        String hasil = "nomor besar adalah:" + besar;
        JOptionPane.showMessageDialog(null,hasil);
    
    }
}