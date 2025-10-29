import java.util.Scanner;

public class Tugas1Kuadrat25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int totalJumlahKuadrat = 0;

        // Outer Loop (i)
        for (int i = 1; i <= n; i++) {
            int kuadrat_i = 0;
            
            // Inner Loop (k)
            for (int k = 1; k <= i; k++) { 
                kuadrat_i += i; 
            }
            
            // Tambahkan hasil kuadrat ke total
            totalJumlahKuadrat += kuadrat_i;
            
            System.out.println("n=" + i + " -> jumlah kuadrat = " + totalJumlahKuadrat);
        }

        System.out.println("\nTotal Jumlah Kuadrat (1^2 + ... + n^2) = " + totalJumlahKuadrat);
        sc.close();
    }
}