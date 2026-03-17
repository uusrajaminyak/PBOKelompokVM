/* Nama File    : Bank.java */
/* Deskripsi    : berisi atribut dan method untuk objek Bank */
/* Pembuat      : Yustinus Hendi Setyawan, Revanska Muhammad Athallah, Kiyoshi Akila Tira, Romualdus Yoas W, Ilham Muhammad Raffi */
/* Tanggal      : Selasa, 17 Maret 2026 */

import java.util.ArrayList;
import java.util.List;

public class Bank {
    // Atribut
    private String namaBank;
    private List<Nasabah> daftarNasabah;

    // Konstruktor
    public Bank(String namaBank) {
        this.namaBank = namaBank;
        this.daftarNasabah = new ArrayList<>();
    }

    // Method untuk menambahkan nasabah ke dalam bank
    public void tambahNasabah(Nasabah nasabah) {
        daftarNasabah.add(nasabah);
        System.out.println("Nasabah " + nasabah.getNama() + " berhasil ditambahkan ke " + namaBank);
    }
}
