/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul_5_pbo;

/**
 *
 * @author LAB-SI-PC
 */
import javax.swing.JOptionPane;
import java.io.*;
import javax.swing.JOptionPane;

public class ver_JOptionPane {
    public static void main(String[] args) {
        
        String kata1 = JOptionPane.showInputDialog("Masukkan kata pertama:");

        String kata2 = JOptionPane.showInputDialog("Masukkan kata kedua:");

        String kata3 = JOptionPane.showInputDialog("Masukkan kata ketiga:");
        
        String msg = kata1 + " " + kata2 + " " + kata3;

        JOptionPane.showMessageDialog(null, "Hasilnya adalah: " + msg);

    }
}