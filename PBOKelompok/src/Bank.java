import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String namaBank;
    private List<Nasabah> daftarNasabah;

    public Bank(String namaBank) {
        this.namaBank = namaBank;
        this.daftarNasabah = new ArrayList<>();
    }

    public void tambahNasabah(Nasabah nasabah) {
        daftarNasabah.add(nasabah);
        System.out.println("Nasabah " + nasabah.getNama() + " berhasil ditambahkan ke " + namaBank);
    }
}
