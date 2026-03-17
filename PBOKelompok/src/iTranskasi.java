/* Nama File    : ITranskasi.java */
/* Deskripsi    : berisi interface untuk transaksi */
/* Pembuat      : Yustinus Hendi Setyawan, Revanska Muhammad Athallah, Kiyoshi Akila Tira, Romualdus Yoas W, Ilham Muhammad Raffi */
/* Tanggal      : Selasa, 17 Maret 2026 */

public interface ITranskasi {
    void execute() throws DanaTidakCukup;
    String getDetailTransaksi();
}
