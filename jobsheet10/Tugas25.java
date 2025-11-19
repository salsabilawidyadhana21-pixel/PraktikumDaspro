import java.util.Scanner;

public class Tugas25 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Baris = Responden (10), Kolom = Pertanyaan (6)
        int[][] survei = new int[10][6]; 
        
        System.out.println("=== Input Hasil Survei (Jawaban 1-5) ===");
        
        // Loop untuk input data
        for (int i = 0; i < survei.length; i++) { 
            System.out.println("\nInput untuk Responden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) { 
                System.out.print("Jawaban Pertanyaan " + (j + 1) + " (1-5): ");
                // Asumsi: Input selalu berupa integer
                survei[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nInput data survei selesai.");

        // Menampilkan nilai rata-rata untuk setiap responden 
        System.out.println("\n=======================================");
        System.out.println("=== Rata-rata Nilai Setiap Responden ===");
        System.out.println("=======================================");
        
        for (int i = 0; i < survei.length; i++) { 
            double totalPerResponden = 0;
            
            for (int j = 0; j < survei[i].length; j++) { 
                totalPerResponden += survei[i][j];
            }
            
            double rataRataResponden = totalPerResponden / survei[i].length;
            System.out.printf("Rata-rata Responden ke-%d: %.2f\n", (i + 1), rataRataResponden);
        }
        
        // Menampilkan nilai rata-rata untuk setiap pertanyaan 
        System.out.println("\n==========================================");
        System.out.println("=== Rata-rata Nilai Setiap Pertanyaan ===");
        System.out.println("==========================================");
        
        for (int j = 0; j < survei[0].length; j++) { 
            double totalPerPertanyaan = 0;
            
            for (int i = 0; i < survei.length; i++) { 
                totalPerPertanyaan += survei[i][j];
            }
            
            double rataRataPertanyaan = totalPerPertanyaan / survei.length;
            System.out.printf("Rata-rata Pertanyaan %d: %.2f\n", (j + 1), rataRataPertanyaan);
        }
        
        // Menghitung dan menampilkan nilai rata-rata keseluruhan
        double totalKeseluruhan = 0;
        int jumlahResponden = survei.length;
        int jumlahPertanyaan = survei[0].length;
        int jumlahElemen = jumlahResponden * jumlahPertanyaan; 

        // Menjumlahkan semua elemen
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }

        double rataRataKeseluruhan = totalKeseluruhan / jumlahElemen;
        
        System.out.println("\n==========================================");
        System.out.println("=== Rata-rata Nilai Survei Keseluruhan ===");
        System.out.println("==========================================");
        System.out.printf("Total Responden x Pertanyaan: %d x %d = %d\n", jumlahResponden, jumlahPertanyaan, jumlahElemen);
        System.out.printf("Rata-rata Keseluruhan: %.2f\n", rataRataKeseluruhan);
        
        sc.close();
    }
}