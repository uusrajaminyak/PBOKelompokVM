/* Nama File    : TransaksiTransfer.java */
/* Deskripsi    : berisi atribut dan method untuk objek TransaksiTransfer */
/* Pembuat      : Yustinus Hendi Setyawan, Revanska Muhammad Athallah, Kiyoshi Akila Tira, Romualdus Yoas W, Ilham Muhammad Raffi */
/* Tanggal      : Selasa, 17 Maret 2026 */

public class TransaksiTransfer implements ITranskasi {
    // Atribut
    private Rekening source;
    private Rekening destination;
    private double amount;

    // Konstruktor
    public TransaksiTransfer(Rekening source, Rekening destination, double amount) {
        this.source = source;
        this.destination = destination;
        this.amount = amount;
    }

    // Method override untuk mengeksekusi transaksi transfer
    @Override
    public void execute() throws DanaTidakCukup {
        source.withdraw(amount);
        destination.deposit(amount, "Transfer dari " + source.getNomorRekening());
    }

    // Method override untuk mendapatkan detail transaksi
    @Override
    public String getDetailTransaksi() {
        return "Transfer dari " + source.getNomorRekening() + " ke " + destination.getNomorRekening() + " sebesar " + amount;
    }
}
