class Transportasi {
    private String nama;
    private int jumlahKursi;
    private String tujuan;

    public Transportasi(String nama, int jumlahKursi, String tujuan) {
        this.nama = nama;
        this.jumlahKursi = jumlahKursi;
        this.tujuan = tujuan;
    }

    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public int getJumlahKursi() { 
        return jumlahKursi; 
    }

    public void setJumlahKursi(int jumlahKursi) { 
        this.jumlahKursi = jumlahKursi; 
    }

    public String getTujuan() { 
        return tujuan; 
    }

    public void setTujuan(String tujuan) { 
        this.tujuan = tujuan; 
    }

    public double hitungHargaTiket() {
        return 100000.0;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        switch (kelasLayanan.toLowerCase()) {
            case "bisnis": harga *= 1.25; break;
            case "vip": harga *= 1.5; break;
            case "ekonomi":
            default: break;
        }
        return harga;
    }
}

class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.10;
    }

    @Override
    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        switch (kelasLayanan.toLowerCase()) {
            case "bisnis": harga *= 1.25; break;
            case "vip": harga *= 1.5; break;
            case "ekonomi":
            default: break;
        }
        return harga;
    }
}

class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.20; 
    }

    @Override
    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        switch (kelasLayanan.toLowerCase()) {
            case "bisnis": harga *= 1.25; break;
            case "vip": harga *= 1.5; break;
            case "ekonomi":
            default: break;
        }
        return harga;
    }
}

class Pesawat extends Transportasi {
    public Pesawat(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.50;
    }

    @Override
    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        switch (kelasLayanan.toLowerCase()) {
            case "bisnis": harga *= 1.25; break;
            case "vip": harga *= 1.5; break;
            case "ekonomi":
            default: break;
        }
        return harga;
    }
}

public class Main {
    public static void main(String[] args) {
        Transportasi[] daftarTransportasi = new Transportasi[3];
        daftarTransportasi[0] = new Bus("Bus", 40, "Bandung");
        daftarTransportasi[1] = new Kereta("Kereta", 200, "Surabaya");
        daftarTransportasi[2] = new Pesawat("Pesawat", 150, "Medan");

        for (Transportasi t : daftarTransportasi) {
            System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket (default): " + t.hitungHargaTiket());
            System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket (Bisnis): " + t.hitungHargaTiket("Bisnis"));
            System.out.println();
        }
    }
}
