

import java.util.Scanner;

public class WifiKampus25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah kamu dosen atau mahasiswa?: ");
        String role = sc.nextLine();

        if (role.equalsIgnoreCase("dosen")) {
            System.out.println("Akses wifi diberikan (dosen)");
        }else if (role.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS kamu: ");
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            }else{
                System.out.println("Akses ditolak, jumlah SKS kamu kurang dari 12");
            }
        }else{
            System.out.println("Akses ditolak");
            }
    }
 }


    
    

