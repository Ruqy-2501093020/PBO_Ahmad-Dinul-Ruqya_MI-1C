/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juni182026;

/**
 *
 * @author LAB-SI-PC
 */
public class Pegawai {
    private String NIP;
    private String Nama;
    private String Golongan;
    private double Gajipokok; // bedarsarkan gol
    private double Tunjangan; // 10%
    private double Potongan; //2%
    private double Gajibersih; // pokok + tunjang - potongan
    
    public Pegawai(){
        
    }
    
    public Pegawai(String temp){
        this.Nama = temp;
    }
    
    public Pegawai(String Nama,String Golongan){
        this.Nama = Nama;
        this.Golongan = Golongan;
    }
    
    public String getNIP(){
        return NIP;
    }
    
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public String getGolongan(){
         if(Golongan.equals("1A")){
            Gajipokok = 300000;    
        } else if(Golongan.equals("1B")){
            Gajipokok = 400000;
        } else{
            Gajipokok = 500000;
        }
        return Golongan;
    }
    
    public void setGolongan(String Golongan){
        this.Golongan = Golongan;
        
    }
    public double getGajipokok(){
        return Gajipokok;
    }
    
    public void setGajipokok(double Gajipokok){
        this.Gajipokok = Gajipokok;
    }
    
    public double getTunjangan(){
        Tunjangan = (Gajipokok * 0.1) + Gajipokok;
        return Tunjangan;
    }
    
    public void setTunjangan(double Tunjangan){
        this.Tunjangan = Tunjangan;
    }
    
    public double getPotongan(){
        Potongan =  Tunjangan - (Tunjangan * 0.02);
        return Potongan;
    }
    
    public void setPotongan(double Potongan){
        this.Potongan = Potongan;
    }  
    public double getGajibersih(){
        Gajibersih = (Gajipokok + Tunjangan) - Potongan;
        return Gajibersih;
    }
    
    public void setGajibersih(double Gajibersih){
        this.Gajibersih = Gajibersih;
    }  
    
    
}