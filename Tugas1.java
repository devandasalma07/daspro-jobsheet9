import java.util.Scanner;
import java. util.Arrays;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        int totalNilai = 0;

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Nilai mahasiswa ke- " + (i + 1) + ": " );
            nilaiMhs[i] = sc.nextInt();
            totalNilai += nilaiMhs[i];
        }
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int i = 1; i < jumlahMhs; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        double rata2 = (double) totalNilai / jumlahMhs;

        System.out.println("Nilai Rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

        for (int i = 0; i < jumlahMhs; i++) {
            String status = (nilaiMhs[i] >= 70) ? "LULUS" : "TIDAL LULUS";
            System.out.println("Mahasiswa ke- " + (i + 1) + ": " + nilaiMhs[i] + "(" + status + ")");
        }
    }
}
