import java.util.Arrays; 

public class Numbers25 { 
    public static void main(String[] args) {
        
        // Deklarasi array 2 dimensi 
        int[][] myNumbers = new int[3][]; 

        // Instansiasi setiap baris dengan panjang yang berbeda
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3]; 
        myNumbers[2] = new int[1]; 
        
        
        // ===============================================
        // Jawaban Pertanyaan 1: Menampilkan seluruh isi array
        System.out.println("--- JAWABAN PERTANYAAN 1 (Isi Array) ---");
        System.out.println("Semua elemen memiliki nilai default 0 (nol).");
        for (int i = 0; i < myNumbers.length; i++) { 
           // Menggunakan Arrays.toString() untuk mencetak isi baris ke-i 
            System.out.println(Arrays.toString(myNumbers[i])); 
        }
        
        
        // ===============================================
        // Jawaban Pertanyaan 4: Menampilkan panjang setiap baris
        System.out.println("\n--- JAWABAN PERTANYAAN 4 (Panjang Setiap Baris) ---");
        for (int i = 0; i < myNumbers.length; i++) { 
            System.out.println("Panjang baris ke-" + (i + 1) + ":" + myNumbers[i].length); 
        }
    }
}