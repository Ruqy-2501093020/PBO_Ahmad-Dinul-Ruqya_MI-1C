/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author LAB-SI-PC
 */
public class ExamplePolimorfis {
    public static void main(String[] args){
        Person ref;
        Student student = new Student();
        Employee employee = new Employee();
        
        printInformation(student);
        printInformation(employee);
        
        employee.name="Budi";
        employee.address="Padang";
        printInformation(employee);
    }
    
    public static void printInformation(Person p){
        System.out.println("Nama :" + p.getName());
        System.out.println("Alamqat :" + p.getAddress());
    }
}
