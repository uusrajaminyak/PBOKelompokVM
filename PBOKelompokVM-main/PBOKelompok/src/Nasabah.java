import java.util.ArrayList;
import java.util.List;

public class Nasabah {
    private String nama;
    private String nik;
    private List<Rekening> daftarRekening;

    public Nasabah(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
        this.daftarRekening = new ArrayList<>();
    }

    public void tambahRekening(Rekening rekening) {
        daftarRekening.add(rekening);
        System.out.println("Rekening " + rekening.getNomorRekening() + " berhasil ditambahkan untuk nasabah: " + nama);
    }

    public void cetakInfoNasabah() {
        System.out.println("=== Informasi Nasabah ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIK : " + nik);
        System.out.println("Daftar Rekening:");
        for (Rekening r : daftarRekening) {
            System.out.println("- No Rekening: " + r.getNomorRekening() + " | Saldo: " + r.getSaldo());
        }
    }

    public String getNama() {
        return nama;
    }

    public List<Rekening> getDaftarRekening() {
        return daftarRekening;
    }
}
