public abstract class AkunBank {
    protected String nomorAkun;
    protected double saldo;

    public AkunBank(String nomorAkun, double saldo) {
        this.nomorAkun = nomorAkun;
        this.saldo = saldo;
    }

    public String getNomorAkun() {
        return nomorAkun;
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
