/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruqy_09042026;

/**
 *
 * @author LAB-SI-PC
 */
public class StudentCountExample {
    public static void main (String[] args){
        StudentRecord aliRecord =  new StudentRecord();
        StudentRecord aniRecord =  new StudentRecord();
        StudentRecord deniRecord =  new StudentRecord("deni", "Payakumbuh");
        deniRecord.print("");
        
        aliRecord.setName(" Ali");
        aliRecord.setaddress(" Padang");
        aliRecord.setAge(20);
        aliRecord.setMathGrade(80);
        aliRecord.setEnglishGrade(70);
        aliRecord.setScienceGrade(90);
        
        System.out.println("Data 1");
        System.out.println("Nama                    :"+aliRecord.getName());
        System.out.println("Alamat                  :"+aliRecord.getAddress());
        System.out.println("umur                    :"+aliRecord.getAge());
        System.out.println("Matematika              :"+aliRecord.getMathGrade());
        System.out.println("B. Inggris              :"+aliRecord.getEnglishGrade());
        System.out.println("Ilmu Pengetahuan        :"+aliRecord.getScienceGrade());
        System.out.println("Rata-rata               :"+aliRecord.getAverage());
        
        aniRecord.setName(" Ani");
        aniRecord.setaddress(" Batusangkar");
        aniRecord.setAge(20);
        aniRecord.setMathGrade(80);
        aniRecord.setEnglishGrade(70);
        aniRecord.setScienceGrade(90);
        aniRecord.print("");
        
        System.out.println("Jumlah SIswa  ="+
                StudentRecord.getStudentcount());
    }
}
