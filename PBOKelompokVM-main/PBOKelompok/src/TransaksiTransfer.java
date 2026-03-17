public class TransaksiTransfer implements ITranskasi {
    private Rekening source;
    private Rekening destination;
    private double amount;

    public TransaksiTransfer(Rekening source, Rekening destination, double amount) {
        this.source = source;
        this.destination = destination;
        this.amount = amount;
    }

    @Override
    public void execute() throws DanaTidakCukup {
        source.withdraw(amount);
        destination.deposit(amount, "Transfer dari");
    }

    @Override
    public String getDetailTransaksi() {
        return "Transfer dari " + source.getNomorRekening() + " ke " + destination.getNomorRekening() + " sebesar " + amount;
    }
}
