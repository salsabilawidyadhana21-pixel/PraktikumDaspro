public class SearchNilai25 { 
    public static void main(String[] args) {
        // Deklarasi dan Inisialisasi array arrNilai
        int[] arrNilai = {80, 85, 78, 96, 90, 82, 86}; 

        // Nilai (key) yang ingin dicari
        int key = 90; 

        // Variabel untuk menyimpan indeks hasil pencarian
        int hasil = 0; 

        // Melakukan linear search
        for (int i = 0; i < arrNilai.length; i++) { 
            if (key == arrNilai[i]) { 
                hasil = i; 
                break; 
            }
        }

        // Menampilkan hasil pencarian
        System.out.println(); 
        System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil); 
        System.out.println(); 
    }
}