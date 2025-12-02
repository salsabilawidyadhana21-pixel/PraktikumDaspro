public class Percobaan1 {

    // Fungsi rekursif 
    static int faktorialRekursif(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorialRekursif(n - 1);
        }
    }

    // Fungsi iteratif 
    static int faktorialIteratif(int n) {
        int faktor = 1;
        // Loop dari n (misalnya 5) hingga 1
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i; 
        }
        return faktor;
    }

    public static void main(String[] args) {
        System.out.println("Hasil faktorial rekursif (5): " + faktorialRekursif(5));
        System.out.println("Hasil faktorial iteratif (5): " + faktorialIteratif(5));
    }
}