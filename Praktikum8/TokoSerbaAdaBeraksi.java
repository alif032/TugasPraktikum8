/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum8;

/**
 *
 * @author LENOVO LOQ
 */
import java.util.Scanner;

public class TokoSerbaAdaBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Membuat array barang yang tersedia di toko
        TokoSerbaAda[] barangList = {
            new TokoSerbaAda("a001", "Penghapus", 1000),
            new TokoSerbaAda("a002", "Pensil", 3000),
            new TokoSerbaAda("a003", "Pulpen", 4000),
            new TokoSerbaAda("a004", "Buku", 5000),
            new TokoSerbaAda("a005", "Spidol", 10000),
        };

        System.out.println("TOKO SERBA ADA");
        System.out.println("***********************");

        // Menanyakan jumlah barang yang akan dibeli oleh pengguna
        System.out.print("Masukkan Item Barang: ");
        int jumlahJenisBarang = input.nextInt();
        input.nextLine(); // untuk menangani bug newline

        // Validasi jumlah barang agar tidak melebihi jumlah barang yang tersedia
        if (jumlahJenisBarang > barangList.length) {
            System.out.println("Maaf, hanya ada " + barangList.length + " jenis barang yang tersedia.");
            jumlahJenisBarang = barangList.length;
        }

        // Loop untuk menerima input dari user sesuai dengan jumlah barang yang ingin dibeli
        for (int i = 0; i < jumlahJenisBarang; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            String kode = input.nextLine();
            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = input.nextInt();
            input.nextLine(); // untuk mengatasi newline

            // Mencari barang berdasarkan kode yang diinput
            for (TokoSerbaAda barang : barangList) {
                if (barang.kode.equals(kode)) {
                    barang.setJumlahBeli(jumlahBeli);
                    break;
                }
            }
        }

        // Menampilkan output tabel barang
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("===============================================================");
        System.out.println("No  Kode       Nama Barang   Harga   Jumlah Beli  Jumlah Bayar");
        System.out.println("===============================================================");
        int totalBayar = 0;
        int nomor = 1;
        for (TokoSerbaAda barang : barangList) {
            if (barang.jumlahBeli > 0) { // Hanya menampilkan barang yang dibeli
                barang.tampilkanData(nomor++);
                totalBayar += barang.getJumlahBayar();
            }
        }
        System.out.println("===============================================================");
        System.out.println("Total Bayar: " + totalBayar);
    }
}
