public class RekeningGiro extends Rekening {
    private double overdraftLimit;

    public RekeningGiro(String nomorRekening, double saldo, double overdraftLimit) {
        super(nomorRekening, saldo);
        this.overdraftLimit = overdraftLimit;
    }

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