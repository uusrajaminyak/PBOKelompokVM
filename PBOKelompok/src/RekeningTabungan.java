public class RekeningTabungan extends Rekening {
    private double saldoMinimum = 50000;

    public RekeningTabungan(String nomorRekening, double saldo) {
        super(nomorRekening, saldo);
    }

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