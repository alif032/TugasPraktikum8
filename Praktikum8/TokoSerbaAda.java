/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum8;

/**
 *
 * @author LENOVO LOQ
 */
public class TokoSerbaAda {
    String kode, nama;
    int harga, jumlahBeli, jumlahBayar;

    // Constructor untuk menginisialisasi kode, nama, dan harga
    public TokoSerbaAda(String kode, String nama, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    // Method untuk mengatur jumlah beli dan menghitung jumlah bayar
    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
        this.jumlahBayar = this.jumlahBeli * this.harga;
    }

    // Method untuk mendapatkan jumlah bayar
    public int getJumlahBayar() {
        return jumlahBayar;
    }

    // Method untuk menampilkan data barang
    public void tampilkanData(int no) {
        System.out.printf("%-3d %-10s %-12s %-7d %-10d %-10d\n", no, kode, nama, harga, jumlahBeli, jumlahBayar);
    } 
}
