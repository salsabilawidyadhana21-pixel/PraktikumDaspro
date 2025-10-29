import java.util.Scanner;

public class NilaiKelompok25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilai;
        float totalNilai, rataNilai;

        i = 1;
        while (i <= 6) { 
            System.out.println("===============================");
            System.out.println("Kelompok " + i);
            System.out.println("===============================");

            totalNilai = 0; 
            
            for (j = 1; j <= 5; j++) { 
                System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt(); 
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;

            System.out.println("Kelompok " + i + ": nilai rata-rata " + rataNilai);
            System.out.println(); 

            i++; 
        }

        sc.close(); 
    }
}