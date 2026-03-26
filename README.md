# OOP - Sistem Data Akademik Mahasiswa
**Mata Kuliah Struktur Data dan Pemrograman Berorientasi Objek**

- Nama: Az Zahra Fiddien Al Farabi
- NRP: 5027251021
- Kelas: B

# Deskripsi Program
Program ini menjelaskan cara kerja sistem informasi akademik sederhana yang berfungsi untuk mengelola data akademik mahasiswa. Program ini akan menghasilkan nama mahasiswa, NRP, dosen wali, dan batas SKS berdasarkan nilai IPK. Sistem ini dikembangkan dengan menerapkan konsep Object-Oriented Programming (OOP) menggunakan bahasa pemrograman Java.

# Class Diagram
**Class Diagram** merupakan salah satu jenis diagram dalam UML (Unified Modeling Language) yang digunakan untuk menggambarkan struktur dari suatu sistem. Diagram ini menampilkan komponen utama seperti class, atribut, metode atau operasi, serta relasi antar kelas. Sehingga class diagram ini akan menggambarkan Sistem Informasi Akademik sederhana.

**1. Struktur Utama (Class):** Sistem ini terdiri dari dua kelas utama:
- `Mahasiswa`: Class yang menyimpan data mahasiswa sekaligus mengatur proses yang berkaitan dengan data tersebut.
- `Main`: Class yang menjalankan program dan mengatur alur jalannya sistem.

**2. Atribut:** 
- `String nama, String nrp, String kelas`: Data identitas yang terlindungi.
- `double ipk`: Data utama untuk penentuan batas SKS.
- `int batasSks`:  Hasil kalkulasi dari nilai IPK.
- `String status`: Kondisi administratif mahasiswa dalam sistem.

**3. Metode:** 
- `Mahasiswa(...)` : Sebagai konstruktor untuk inisialisasi objek.
- `-hitungBatasSks(double)`: Sebagai logika untuk menentukan batas SKS.
- `getNama(), setIpk(), (Getter & Setter)`: Untuk mengakses data yang ada di dalam sebuah Class.
- `printInfoMahasiswa()`: Sebagai output untuk menampilkan data mahasiswa ke layar.

**4. Relasi Antar Class:**
- Diagram ini menggambarkan relasi *Dependency* (Ketergantungan): Class Main bergantung pada Class Mahasiswa untuk membuat objek dan mengolah data. Tanpa Class Mahasiswa, Class Main tidak memiliki data yang bisa diproses.

Berikut gambar class diagram dari program ini yang diproses oleh mermaid.ai:
<img width="862" height="592" alt="Screenshot 2026-03-25 224450" src="https://github.com/user-attachments/assets/ae1f4a2a-557b-4e59-b471-eabeb87ef315" />

# Kode Program
## 1. Class
**Class** merupakan kerangka kerja (*blueprint*) yang mendefinisikan atribut (data) dan metode (fungsi) yang akan dimanfaatkan oleh projek

```java
public class Mahasiswa {}
public class Main {}
```
- **Class Mahasiswa:** Kode ini mendefinisikan *class* sebagai **Mahasiswa**, yang digunakan untuk merepresentasikan sebuah objek mahasiswa dengan atribut seperti nama, NRP, dosen wali, IPK, batas SKS.
- **Class Main:** Kode ini mendefinisikan sebagai titik awal jalannya program. Class ini bertanggung jawab untuk mengoordinasikan alur sistem, mulai dari pembuatan objek mahasiswa hingga menampilkan informasi tersebut ke layar. Tanpa Class Main, kode pada Class Mahasiswa tidak dapat dieksekusi.

## 2. Object
**Object** merupakan instansi dari sebuah *class*.

```java
Mahasiswa m1 = new Mahasiswa("Minji Sastro", "5027261021", "A", "Agus Wijayasena S.Kom., M.Kom.", 3.85);
Mahasiswa m2 = new Mahasiswa("Jewu Malik", "5027261022", "B", "Dr. Indah Wahyuni, S.Kom., M.T.", 3.2);
Mahasiswa m3 = new Mahasiswa("Jewu Malik", "5027261022", "B", "Dr. Indah Wahyuni, S.Kom., M.T.", 3.2);
Mahasiswa m4 = new Mahasiswa("Sakha Gemi", "5027261090", "A", "Andi Wijaya, S.Kom., M.T.", 3.55);
Mahasiswa m5 = new Mahasiswa("Maisyaa Avicena", "5027261015", "C", "Budi Santoso S.Kom., M.Kom.", 3.78);

```
Pada kode class **Main**, dibuat 5 object dari class **Mahasiswa** (`Mahasiswa m1`, `Mahasiswa m2`, dan seterusnya) yang merepresentasikan 5 mahasiswa dengan identitas dan nilai IPK yang unik.

## B. Constructor
**Constructor** merupakan fungsi khusus yang otomatis dipanggil saat objek dibuat. 

```java
public Mahasiswa(String nama, String nrp, String kelas, String dosenWali, double ipk) {
    this.nama = nama;
    this.nrp = nrp;
    this.kelas = kelas;
    this.dosenWali = dosenWali;
    this.ipk = ipk;
    this.batasSks = hitungBatasSks(ipk);
}
```
Kode ini menunjukkan bahwa **Class Mahasiswa** memiliki constructor dengan parameter yang berfungsi:
- Untuk memastikan setiap objek mahasiswa dibuat dengan data identitas lengkap dan nilai IPK.
- Untuk mengisi atribut serta menghitung jumlah SKS secara langsung.

## 4 Pillars of OOP
## Abstraction
**Abstraction** merupakan konsep dalam Object Oriented Programming (OOP) yang berfungsi sebagai konsep

```java
public void printInfoMahasiswa() {}

private int hitungBatasSks(double nilaiIpk) {
    if (nilaiIpk >= 3.5) return 24;
    if (nilaiIpk >= 3.0) return 22;
    if (nilaiIpk >= 2.5) return 20;
    return 18;
}
```

Abstraction diterapkan melalui metode:
- `printInfoMahasiswa()`:  Class Main cukup memanggil metode ini untuk mendapatkan informasi lengkap mahasiswa tanpa perlu mengetahui bagaimana proses pengolahan datanya.
- `hitungBatasSks()`: Metode ini disembunyikan dari pengguna, sehingga yang diterima hanya hasil akhir berupa jumlah SKS yang sudah valid.

## Enscapsulation
**Enscapsulation** (enskapsulasi) adalah salah satu konsep penting dalam OOP yang berfungsi untuk menyembunyikan detail implementasi di dalam class dan hanya menampilkan informasi atau fungsi yang diperlukan oleh pengguna.

Melalui enkapsulasi, akses terhadap data dan metode pada suatu kelas dapat dibatasi menggunakan *access modifier*. Beberapa modifier yang sering digunakan antara lain:

- **Private**: Membatasi akses hanya dari dalam kelas itu sendiri.
- **Protected**: Memungkinkan akses dari dalam kelas dan kelas turunannya.
- **Public**: Memungkinkan akses dari luar kelas.

Dengan enkapsulasi, data lebih terlindungi dari perubahan sembarangan, sehingga keamanan, fleksibilitas kode, dan integritas data dalam program dapat lebih terjaga.

### 1. Private
```java
    private String nama;
    private String nrp;
    private String kelas;
    private String dosenWali;
    private double ipk;
    private int batasSks;
    private String status = "Aktif"; 
```
**Kode atribut** tersebut dibuat *modifier* sebagai **private** agar tidak dapat diakses langsung dari luar class. 

Dengan demikian, data di dalam objek tetap terlindungi (terenkapsulasi) dan hanya bisa diakses atau dimodifikasi melalui method resmi yang disediakan, yaitu:
- **Getter Method**: `getNama()`, `getIpk()`, `getBatasSks()`.
- **Setter Method**: `setNama()`, `setIpk()`.

### 2. Public
```java
public Mahasiswa(String nama, String nrp, String kelas, String dosenWali, double ipk){}

public void printInfoMahasiswa() {}

public String getNama() { return nama; }
public void setNama(String nama) { this.nama = nama; }
public double getIpk() { return ipk; }
public void setIpk(double ipk) { 
    this.ipk = ipk; 
    this.batasSks = hitungBatasSks(ipk); 
}

public int getBatasSks() { return batasSks; }
```
**Kode atribut** tersebut dibuat *modifier* sebagai **public** agar dapat diakses langsung dari luar class. 

Dengan demikian, method public berfungsi sebagai perantara agar lass lain dapat berinteraksi dengan data mahasiswa tanpa mengakses langsung variabel internal. Hal ini mendukung prinsip enkapsulasi, di mana data tetap terlindungi (private), sementara akses diberikan secara terkontrol melalui getter, setter, dan method lainnya.

## Inheritance
**Inheritance** (pewarisan) merupakan salah satu konsep utama dalam OOP yang memungkinkan sebuah subclass (kelas anak) untuk mewarisi atribut dan metode dari superclass (kelas induk). Pada program ini, konsep *inheritance* belum digunakan karena tidak ada class yang diturunkan dari class lain. 

## Polymorphism
**Polymorphism** dalam Object Oriented Programming (OOP)merupakan sebuah method atau objek untuk melakukan fungsi yang berbeda meskipun menggunakan nama yang sama. Karena hal itu, Polymorphism memungkinkan program menjadi lebih fleksibel dan mudah dikembangkan. Tetapi, pada project ini belum terdapat implementasi *polymorphism*, karena:
- Tidak ada method dengan nama yang sama tetapi parameter berbeda (method overloading), misalnya dua constructor atau dua fungsi setIpk.
- Tidak ada class turunan yang mengoverride method dari class induk (method overriding) karena program ini hanya memiliki satu class utama yaitu Mahasiswa.

Class Mahasiswa saat ini hanya memiliki method spesifik seperti:
```java
public void printInfoMahasiswa()
public String getNama()
public void setIpk(double ipk)
private int hitungBatasSks(double nilaiIpk)
```
Dalam kode di atas, setiap method memiliki fungsi tunggal yang unik dan tidak memiliki variasi bentuk, sehingga belum memenuhi kriteria konsep *polymorphism*.

# Kode Lengkap
**Class Mahasiswa**:
```java
public class Mahasiswa {
    private String nama;
    private String nrp;
    private String kelas;
    private String dosenWali;
    private double ipk;
    private int batasSks;
    private String status = "Aktif"; 

    // Constructor
    public Mahasiswa(String nama, String nrp, String kelas, String dosenWali, double ipk) {
        this.nama = nama;
        this.nrp = nrp;
        this.kelas = kelas;
        this.dosenWali = dosenWali;
        this.ipk = ipk;
        this.batasSks = hitungBatasSks(ipk);
    }

    // SKS
    private int hitungBatasSks(double nilaiIpk) {
        if (nilaiIpk >= 3.5) return 24;
        if (nilaiIpk >= 3.0) return 22;
        if (nilaiIpk >= 2.5) return 20;
        return 18;
    }

    public void printInfoMahasiswa() {
        System.out.println("Nama            : " + nama);
        System.out.println("NRP             : " + nrp);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Dosen Wali      : " + dosenWali);
        System.out.println("IPK Terakhir    : " + ipk);
        System.out.println("Batas SKS       : " + batasSks);
        System.out.println("Status          : " + status);
    }

    // Getter Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public double getIpk() { return ipk; }
    public void setIpk(double ipk) { 
        this.ipk = ipk; 
        this.batasSks = hitungBatasSks(ipk); 
    }

    public int getBatasSks() { return batasSks; }
}
```

**Class Main**:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("===== Sistem Informasi Akademik Mahasiswa =====");
        
        Mahasiswa m1 = new Mahasiswa("Minji Sastro", "5027261021", "A", "Agus Wijayasena S.Kom., M.Kom.", 3.85);
        System.out.println("Data Mahasiswa 1:");
        m1.printInfoMahasiswa();
        System.out.println("\n--------------------------------\n");

        Mahasiswa m2 = new Mahasiswa("Jewu Malik", "5027261022", "B", "Dr. Indah Wahyuni, S.Kom., M.T.", 3.2);
        System.out.println("Data Mahasiswa 2:");
        m2.printInfoMahasiswa();
        System.out.println("\n----------------------------------\n");

        
        Mahasiswa m3 = new Mahasiswa("Jewu Malik", "5027261022", "B", "Dr. Indah Wahyuni, S.Kom., M.T.", 3.2);
        System.out.println("Data Mahasiswa 3:");
        m3.printInfoMahasiswa();
        System.out.println("\n----------------------------------\n");

        Mahasiswa m4 = new Mahasiswa("Sakha Gemi", "5027261090", "A", "Andi Wijaya, S.Kom., M.T.", 3.55);
        System.out.println("Data Mahasiswa 4:");
        m4.printInfoMahasiswa();
        System.out.println("\n----------------------------------\n");

        Mahasiswa m5 = new Mahasiswa("Maisyaa Avicena", "5027261015", "C", "Budi Santoso S.Kom., M.Kom.", 3.78);
        System.out.println("Data Mahasiswa 5:");
        m5.printInfoMahasiswa();
        System.out.println("\n----------------------------------\n");

    }
}
```
# Output Program
<img width="1485" height="762" alt="Screenshot 2026-03-25 233040" src="https://github.com/user-attachments/assets/fabd9763-2a30-4c5b-88c2-afc918b20f6d" />
<img width="1480" height="628" alt="Screenshot 2026-03-25 233100" src="https://github.com/user-attachments/assets/5cb93864-433e-463f-9ebf-360cfff88a69" />

# Keunikan Program
Ada beberapa keunikan dari program Sistem Informasi Akademik Mahasiswa sederhana yang saya buat, yaitu:
- Program ini memiliki mekanisme perhitungan otomatis. Batas SKS tidak ditentukan oleh pengguna, melainkan dihitung secara dinamis oleh sistem berdasarkan nilai IPK melalui metode privat `hitungBatasSks`. 
- Program ini mengimplementasikan enkapsulasi lanjutan pada method `setIpk()`. Saat nilai IPK diubah, sistem tidak hanya memperbarui nilai tersebut, tetapi juga secara otomatis menyesuaikan nilai batas SKS. 
- Program ini memiliki atribut `status` yang secara otomatis diinisialisasi dengan nilai "Aktif" pada setiap objek baru. Hal ini mencerminkan desain sistem di dunia nyata yang menyediakan nilai default administratif tanpa perlu diinput berulang, sehingga meningkatkan efisiensi serta mempermudah interaksi dengan objek.
- Metode perhitungan SKS dibuat dengan modifier **private** agar class lain tidak memiliki akses untuk mengubah atau memodifikasi rumus perhitungan. Dengan demikian, aturan akademik tetap terjaga, aman, dan konsisten di dalam kelas Mahasiswa.
