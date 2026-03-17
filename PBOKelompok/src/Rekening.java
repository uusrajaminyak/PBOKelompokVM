/* Nama File    : Rekening.java */
/* Deskripsi    : berisi atribut dan method untuk objek Rekening */
/* Pembuat      : Yustinus Hendi Setyawan, Revanska Muhammad Athallah, Kiyoshi Akila Tira, Romualdus Yoas W, Ilham Muhammad Raffi */
/* Tanggal      : Selasa, 17 Maret 2026 */

public abstract class Rekening {
    // Atribut
    protected String nomorRekening;
    protected double saldo;

    // Konstruktor
    public Rekening(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    // Selektor
    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    // Method untuk melakukan deposit
    public void deposit(double jumlah) {
        assert jumlah > 0 : "Jumlah deposit harus merupakan bilangan positif";
        saldo += jumlah;
        System.out.println("Deposit sebesar " + jumlah + " berhasil. Saldo sekarang: " + saldo);
    }

    public void deposit(double jumlah, String keterangan) {
        assert jumlah > 0 : "Jumlah deposit harus merupakan bilangan positif";
        saldo += jumlah;
        System.out.println("Deposit sebesar " + jumlah + " berhasil. Keterangan: " + keterangan + ". Saldo sekarang: " + saldo);
    }

    // Method abstract untuk melakukan penarikan
    public abstract void withdraw(double jumlah) throws DanaTidakCukup;
}
