package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS25 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--- Cetak KRS SIAKAD ---");
     System.out.println("Apakah UKT sudah dibayar? (true/false): ");
     boolean uktLunas = sc.nextBoolean();

     if (uktLunas) {
          System.out.println("Pembayaran UKT terverifikasi");
          System.out.println("silahkan cetak KRS dan minta tanda tangan DPA");
     
     }else{
          System.out.println("Registrasi ditolak, silahkan bayar UKT dulu");
     }
} 

}
   
     



     

