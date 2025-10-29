import java.util.Scanner;

public class Star25 {
    public static void main(String[] args) {
        // Deklarasi objek Scanner
        Scanner sc = new Scanner(System.in); 

        // Input nilai n
        System.out.print("Masukkan nilai n="); 
        int n = sc.nextInt(); 

        // Sintaks perulangan untuk mencetak * sebanyak n kali
        for(int i=1; i<=n; i++) {
            System.out.print("*"); 
        }
        
        System.out.println(); 
        
        sc.close();
    }
}