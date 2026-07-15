/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author LAB-SI-PC
 */
public class AbstractExample {
    public static void main(String[] args){
        Manusia m = new Manusia();
        m.breath();
        m.eat();
        m.walk();
        
        KUDA k = new KUDA();
        k.breath();
        k.eat();
        k.walk();
    }
}
