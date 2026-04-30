/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class OperasiArit {
    public static void main(String[] args){
        System.out.println("Number of arguments=" +args.length);
        System.out.println("" +args[0]);
        System.out.println("" +args[1]);
        int a1 = Integer.parseInt(args[0]);
        int a2 = Integer.parseInt(args[1]);
        
        int tambah = a1 + a2;
        int kurang = a1 - a2;
        int kali = a1 * a2;
        int bagi = a1 / a2;
        
        System.out.println("tambah:"+ tambah);
        System.out.println("kurang:"+ kurang);
        System.out.println("kali:"+ kali);
        System.out.println("bagi:"+ bagi);
    }
}
