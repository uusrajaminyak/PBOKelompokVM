public abstract class Rekening {
    protected String nomorRekening;
    protected double saldo;

    public Rekening(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

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

    public abstract void withdraw(double jumlah) throws DanaTidakCukup;
}
