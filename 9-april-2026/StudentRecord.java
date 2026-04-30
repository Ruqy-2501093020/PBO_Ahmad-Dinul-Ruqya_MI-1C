/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruqy_09042026;

/**
 *
 * @author LAB-SI-PC
 */
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentcount;
    
    public StudentRecord() {
        studentcount++;
    }

    public StudentRecord(String temp) {
        studentcount++;
        this.name = temp;
    }

    public StudentRecord(String name, String address) {
        studentcount++;
        this.name = name;
        this.address = address;
    }

    public StudentRecord(double mGrade, double eGrade, double sGrade) {
        studentcount++;
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
    }
   
    public String getName() {
    return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress() {
    return address;
    }
    public void setaddress(String address){
        this.address = address;
    }
    public int getAge() {
    return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getMathGrade (){
    return mathGrade;
    }
    public void setMathGrade(int mathGrade){
        this.mathGrade = mathGrade;
}
    public double getEnglishGrade() {
    return englishGrade;
    }
    public void setEnglishGrade(int englishGrade){
        this.englishGrade = englishGrade;
}
    public double getScienceGrade() {
    return scienceGrade;
    }
    public void setScienceGrade(int scienceGrade){
        this.scienceGrade = scienceGrade;
}
    public double getAverage() {
    average = (mathGrade + englishGrade + scienceGrade) / 3;
    return average;
    }
    public static int getStudentcount(){
        return studentcount;
    }
    
    public void print(String temp){
        System.out.println("Name:" +name);
        System.out.println("Address:" +address);
        System.out.println("Age:" +age);
    }
    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name:" +name);
        System.out.println("Math Grade:" +mGrade);
        System.out.println("English Grade:" +eGrade);
        System.out.println("Science Grade:" +sGrade);
    }
}