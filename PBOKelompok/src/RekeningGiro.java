/* Nama File    : RekeningGiro.java */
/* Deskripsi    : berisi atribut dan method untuk objek RekeningGiro */
/* Pembuat      : Yustinus Hendi Setyawan, Revanska Muhammad Athallah, Kiyoshi Akila Tira, Romualdus Yoas W, Ilham Muhammad Raffi */
/* Tanggal      : Selasa, 17 Maret 2026 */

public class RekeningGiro extends Rekening {
    // Atribut
    private double overdraftLimit;

    // Konstruktor
    public RekeningGiro(String nomorRekening, double saldo, double overdraftLimit) {
        super(nomorRekening, saldo);
        this.overdraftLimit = overdraftLimit;
    }

    // Method override untuk melakukan penarikan dengan memperhatikan batas overdraft
    @Override
    public void withdraw(double jumlah) throws DanaTidakCukup {
        assert jumlah > 0 : "Jumlah penarikan harus merupakan bilangan positif";
        if (saldo - jumlah < -overdraftLimit) {
            throw new DanaTidakCukup("Saldo tidak cukup untuk melakukan penarikan sebesar " + jumlah + ". Batas overdraft adalah " + overdraftLimit);
        }
        saldo -= jumlah;
        System.out.println("Penarikan giro sebesar " + jumlah + " berhasil. Saldo sekarang: " + saldo);
    }
}