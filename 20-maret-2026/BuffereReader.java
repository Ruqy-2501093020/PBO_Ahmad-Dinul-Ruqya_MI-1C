/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_5_pbo_ruqy;
import java.io.*;
/**
 *
 * 
 */
public class BuffereReader {
    public static void main (String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
        String word1=  "";
        String Word2 = "";
        String Word3 = "";
        try{
            System.out.print("Masukkan kata  :");
            word1 = dataIn.readLine();
            System.out.print("Masukkan kata  :");
            Word2 = dataIn.readLine();
            System.out.print("Masukkan kata  :");
            Word3 = dataIn.readLine();
        }catch (IOException e){
            System.out.print("Error!");
        }
        System.out.println("------------------");
        System.out.print(word1);
        System.out.print(" " + Word2);
        System.out.print(" " + Word3);
    }
}
