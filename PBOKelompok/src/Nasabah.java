/* Nama File    : Nasabah.java */
/* Deskripsi    : berisi atribut dan method untuk objek Nasabah */
/* Pembuat      : Yustinus Hendi Setyawan, Revanska Muhammad Athallah, Kiyoshi Akila Tira, Romualdus Yoas W, Ilham Muhammad Raffi */
/* Tanggal      : Selasa, 17 Maret 2026 */

import java.util.ArrayList;
import java.util.List;

public class Nasabah {
    // Atribut
    private String nama;
    private String nik;
    private List<Rekening> daftarRekening;

    // Konstruktor
    public Nasabah(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
        this.daftarRekening = new ArrayList<>();
    }

    // Method untuk menambahkan rekening ke dalam daftar rekening nasabah
    public void tambahRekening(Rekening rekening) {
        daftarRekening.add(rekening);
        System.out.println("Rekening " + rekening.getNomorRekening() + " berhasil ditambahkan untuk nasabah: " + nama);
    }

    // Method untuk mencetak informasi nasabah beserta daftar rekeningnya
    public void cetakInfoNasabah() {
        System.out.println("\n=== Informasi Nasabah ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIK : " + nik);
        System.out.println("Daftar Rekening:");
        for (Rekening r : daftarRekening) {
            System.out.println("- No Rekening: " + r.getNomorRekening() + " | Saldo: " + r.getSaldo());
        }
    }

    // Selektor
    public String getNama() {
        return nama;
    }

    public List<Rekening> getDaftarRekening() {
        return daftarRekening;
    }
}
