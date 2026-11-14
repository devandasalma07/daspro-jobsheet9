import java.util.Arrays;
import java.util.Scanner;

public class ArrayNilai09 {
    public static void main(String[] args) {
    int[] nilaiAkhir = new int[10];
    Scanner sc = new Scanner(System.in);
    int jumlahLulus = 0;
    int jumlahTidakLulus = 0;

    for ( int i = 0; i < nilaiAkhir.length; i++) {
        System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilaiAkhir[i] = sc.nextInt();
    }

    for ( int i = 0; i < nilaiAkhir.length; i++) {
        if (nilaiAkhir[i] > 70) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
            jumlahLulus++;
        } else {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (TIDAK LULUS)");
            jumlahTidakLulus++;
        }
      }

      System.out.println("\nJumlah mahasiswa yang lulus: " + jumlahLulus);
      System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahTidakLulus);
    }
    
}
