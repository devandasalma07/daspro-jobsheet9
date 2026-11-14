import java.util.Scanner;
import java.util.Arrays;

public class SearchNilai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai: ");
        int jumlah = sc.nextInt();
        int[] nilai = new int[jumlah];
        
        for (int i = 0; i < nilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan. Nilai " + key + "tidak ada didalam data array " + Arrays.toString(nilai));
        }
    }
}

