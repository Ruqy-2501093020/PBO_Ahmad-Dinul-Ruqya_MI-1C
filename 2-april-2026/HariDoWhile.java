/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author LAB-SI-PC
 */
public class HariDoWhile {
    public static void main(String[] args){
        String[] days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int i = 0;
        do{
           System.out.println(days[i]);
           i++;
        } while(i < days.length);
        
        
    }
}
