package alif;

public class Ruqy1 {
   String nip;
   String nama;
   String golongan;
   double gajiPokok;
   double tunjangan;
   double potongan;
   double gajiBersih;

   public Ruqy1(String nip, String nama, String golongan, double potongan) {
      this.nip = nip;
      this.nama = nama;
      this.golongan = golongan;
      this.potongan = potongan;
      this.hitungGaji();
   }

   public void hitungGaji() {
      if (this.golongan.equalsIgnoreCase("A")) {
         this.gajiPokok = (double)3000000.0F;
      } else if (this.golongan.equalsIgnoreCase("B")) {
         this.gajiPokok = (double)4000000.0F;
      } else if (this.golongan.equalsIgnoreCase("C")) {
         this.gajiPokok = (double)5000000.0F;
      } else {
         this.gajiPokok = (double)0.0F;
      }

      this.tunjangan = 0.1 * this.gajiPokok;
      this.gajiBersih = this.gajiPokok + this.tunjangan - this.potongan;
   }

   public void tampilData() {
      System.out.println("NIP : " + this.nip);
      System.out.println("Nama : " + this.nama);
      System.out.println("Golongan : " + this.golongan);
      System.out.println("Gaji Pokok : " + this.gajiPokok);
      System.out.println("Tunjangan : " + this.tunjangan);
      System.out.println("Potongan : " + this.potongan);
      System.out.println("Gaji Bersih : " + this.gajiBersih);
   }
}
