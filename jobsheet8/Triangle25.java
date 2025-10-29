import java.util.Scanner;

public class Triangle25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 0;
        while (i <= n) { // Outer loop 
            int j = 0;
            while (j < i) { // Inner loop
                System.out.print("*");
                j++;
            }
            i++;
        }

        sc.close();
    }
}