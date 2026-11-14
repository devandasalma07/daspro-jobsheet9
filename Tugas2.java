import java.util.Scanner;
import java.util.Arrays;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] menu = {"Nasi goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("====== Daftar menu Kampus ======");

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-3d %-20s : Rp %, d\n", ( i + 1), menu[i], harga[i]);
        }
        System.out.println("==============================================\n");

        System.out.print("Apakah ingin melihat menu terlebih dahulu? (y/n): ");
        String cari = sc.nextLine();

        while (cari.equalsIgnoreCase("y")) {
            System.out.print("Masukkan nama makanan/minuman yang dicari: ");
            String key = sc.nextLine();

            int indeks = -1;
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(key)) {
                    indeks = i;
                    break;
                }
            }
            if (indeks != -1) {
                System.out.printf("-> Menu '%s tersedia dengan harga Rp %,d\n\n", menu[indeks], harga[indeks]);
            } else {
                System.out.println("-> Maaf, menu tidak tersedia. \n");
            }
            System.out.print("Ingin melihat menu lain? (y/n): ");
            cari = sc.nextLine();
        }
        System.out.print("Masukkan jumlah item yang dipesan: ");
        int jumlahItem = sc.nextInt();
        sc.nextLine();

        String[] daftarPesanan = new String[jumlahItem];
        int[] hargaPesanan = new int[jumlahItem];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahItem; i++) {
            boolean menuValid = false;

            while (!menuValid) {
                System.out.print("Menu pesanan ke- " + (i+1) + ": ");
                String namaPesanan = sc.nextLine();

                int indeks = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesanan)) {
                        indeks = j;
                        break;
                    }
                }
                if (indeks != -1) {
                    daftarPesanan[i] = menu[indeks];
                    hargaPesanan[i] = harga[indeks];
                    totalBiaya += harga[indeks];
                    menuValid = true;
                } else {
                    System.out.println("Menu tidak tersedia! silahkan masukkan nama menu yang ada di daftar.");
                }
            }
        }
        System.out.println("======= Struk pemesanan kafe ======");
        for (int i = 0; i < jumlahItem; i++) {
            System.out.printf("%-3d %-20s : Rp %,d\n", (i+1), daftarPesanan[i], hargaPesanan[i]);
        }
        System.out.printf(" Total Biaya: Rp %,d\n", totalBiaya);
    }
    
}
