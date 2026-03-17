/* Nama File    : Main.java */
/* Deskripsi    : berisi realisasi untuk semua atribut dan method objek */
/* Pembuat      : Yustinus Hendi Setyawan, Revanska Muhammad Athallah, Kiyoshi Akila Tira, Romualdus Yoas W, Ilham Muhammad Raffi */
/* Tanggal      : Selasa, 17 Maret 2026 */

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bank VM Gondrong ===\n");

        System.out.println("=== Membuat Bank dan Nasabah ===");
        Bank bankVMGondrong = new Bank("Bank VM Gondrong");
        Nasabah Budi = new Nasabah("Budi", "1234567890");
        bankVMGondrong.tambahNasabah(Budi);

        System.out.println("\n=== Menambahkan Rekening untuk Budi ===");
        Rekening tabunganBudi = new RekeningTabungan("TAB-001", 1000000);
        Rekening giroBudi = new RekeningGiro("GIRO-001", 500000, 200000);
        Budi.tambahRekening(tabunganBudi);
        Budi.tambahRekening(giroBudi);

        Budi.cetakInfoNasabah();

        System.out.println("\n=== Melakukan Deposit ===");
        tabunganBudi.deposit(500000);
        tabunganBudi.deposit(300000, "Bonus bulanan");
        try {
            tabunganBudi.deposit(-100000);
        } catch (AssertionError e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== Melakukan Penarikan ===");
        try {
            tabunganBudi.withdraw(200000);
            tabunganBudi.withdraw(1500000);
        } catch (DanaTidakCukup e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== Melakukan Transfer ===");
        ITranskasi transfer = new TransaksiTransfer(tabunganBudi, giroBudi, 100000);
        System.out.println("Detail transaksi: " + transfer.getDetailTransaksi());
        try {
            transfer.execute();
        } catch (DanaTidakCukup e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
