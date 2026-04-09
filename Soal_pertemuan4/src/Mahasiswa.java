public class Mahasiswa extends Orang {
    private String nrp;
    private String kelas;
    private String dosenWali;
    private double ipk;
    private int batasSks;
    private String status = "Aktif";

    // Constructor
    public Mahasiswa(String nama, String nrp, String kelas, String dosenWali, double ipk) {
        super(nama); // ambil dari parent
        this.nrp = nrp;
        this.kelas = kelas;
        this.dosenWali = dosenWali;
        this.ipk = ipk;
        this.batasSks = hitungBatasSks(ipk);
    }

    // Abstraction 
    private int hitungBatasSks(double nilaiIpk) {
        if (nilaiIpk >= 3.5) return 24;
        if (nilaiIpk >= 3.0) return 22;
        if (nilaiIpk >= 2.5) return 20;
        return 18;
    }

    // Polymorphism 
    @Override
    public void printInfo() {
        super.printInfo(); // dari class Orang
        System.out.println("NRP             : " + nrp);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Dosen Wali      : " + dosenWali);
        System.out.println("IPK Terakhir    : " + ipk);
        System.out.println("Batas SKS       : " + batasSks);
        System.out.println("Status          : " + status);
    }

    // Getter Setter (Encapsulation)
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getIpk() { return ipk; }

    public void setIpk(double ipk) {
        this.ipk = ipk;
        this.batasSks = hitungBatasSks(ipk);
    }

    public int getBatasSks() { return batasSks; }
}