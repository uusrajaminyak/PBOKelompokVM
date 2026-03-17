/* Nama File    : RekeningTabungan.java */
/* Deskripsi    : berisi atribut dan method untuk objek RekeningTabungan */
/* Pembuat      : Yustinus Hendi Setyawan, Revanska Muhammad Athallah, Kiyoshi Akila Tira, Romualdus Yoas W, Ilham Muhammad Raffi */
/* Tanggal      : Selasa, 17 Maret 2026 */

public class RekeningTabungan extends Rekening {
    // Atribut
    private double saldoMinimum = 50000;

    // Konstruktor
    public RekeningTabungan(String nomorRekening, double saldo) {
        super(nomorRekening, saldo);
    }

    // Method untuk melakukan penarikan dengan memperhatikan saldo minimum
    @Override
    public void withdraw(double jumlah) throws DanaTidakCukup {
        assert jumlah > 0 : "Jumlah penarikan harus merupakan bilangan positif";
        if (saldo - jumlah < saldoMinimum) {
            throw new DanaTidakCukup("Saldo tidak cukup untuk melakukan penarikan sebesar " + jumlah + ". Saldo minimum yang harus dipertahankan adalah " + saldoMinimum);
        }
        saldo -= jumlah;
        System.out.println("Penarikan sebesar " + jumlah + " berhasil. Saldo sekarang: " + saldo);
    }
}