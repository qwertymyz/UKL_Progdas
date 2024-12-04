
package soalukl;

import java.util.Scanner;

public class uklsulitno3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        // Deklarasi array
        int[] array = new int[n];

        // Input elemen array
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Menghitung dan menampilkan frekuensi elemen dalam array
        System.out.println("Frekuensi elemen dalam array:");
        
        for (int i = 0; i < n; i++) {
            // Menghindari perhitungan ulang untuk elemen yang sudah dihitung
            boolean sudahDihitung = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    sudahDihitung = true;
                    break;
                }
            }

            // Jika elemen belum dihitung
            if (!sudahDihitung) {
                int Hitung = 1; // Hitung frekuensi elemen yang pertama kali ditemukan
                for (int k = i + 1; k < n; k++) {
                    if (array[i] == array[k]) {
                        Hitung++;
                    }
                }
                System.out.println(array[i] + " muncul " + Hitung + " kali");
            }
        }
    }
}
 
    

