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
- `Orang` : Class induk (parent) yang merepresentasikan entitas umum dan menyimpan atribut dasar berupa nama.
- `Mahasiswa`: Class turunan (child) dari Orang yang menyimpan data mahasiswa serta mengelola proses terkait akademik.
- `Main`: Class yang menjalankan program dan mengatur alur jalannya sistem.

**2. Atribut:** 
- `#String nama` : Atribut pada class Orang yang bersifat protected sehingga dapat diwariskan ke class Mahasiswa.
- `String nrp, String kelas`: Data identitas yang terlindungi.
- `double ipk`: Data utama untuk penentuan batas SKS.
- `int batasSks`:  Hasil kalkulasi dari nilai IPK.
- `String status`: Kondisi administratif mahasiswa dalam sistem.

**3. Metode:** 
- `Orang(String nama)` : Konstruktor pada class Orang untuk inisialisasi nama.
- `Mahasiswa(...)` : Sebagai konstruktor untuk inisialisasi objek.
- `main(String[] args)` : Method utama pada class Main sebagai titik awal eksekusi program.
- `-hitungBatasSks(double)`: Sebagai logika untuk menentukan batas SKS.
- `getNama(), setIpk(), (Getter & Setter)`: Untuk mengakses data yang ada di dalam sebuah Class.
- `printInfoMahasiswa()`: Sebagai output untuk menampilkan data mahasiswa ke layar.

**4. Relasi Antar Class:**
- Diagram ini menggambarkan relasi Inheritance (Pewarisan): Class Mahasiswa merupakan turunan dari class Orang, sehingga mewarisi atribut dan method yang dimiliki oleh Orang.
- Diagram ini menggambarkan relasi *Dependency* (Ketergantungan): Class Main bergantung pada Class Mahasiswa untuk membuat objek dan mengolah data. Tanpa Class Mahasiswa, Class Main tidak memiliki data yang bisa diproses.

Berikut gambar class diagram dari program ini yang diproses oleh mermaid.ai:

<img width="869" height="578" alt="Screenshot 2026-04-08 164251" src="https://github.com/user-attachments/assets/96a917c4-1224-4e58-b9e7-2813a525acd7" />

# Kode Program
## 1. Class
**Class** merupakan kerangka kerja (*blueprint*) yang mendefinisikan atribut (data) dan metode (fungsi) yang akan dimanfaatkan oleh projek

```java
public class Orang {}
public class Mahasiswa {}
public class Main {}
```
- **Class Orang:** Kode ini merupakan class induk (superclass) yang menyimpan atribut dasar berupa nama.
- **Class Mahasiswa:** Kode ini mendefinisikan *class* sebagai **Mahasiswa**, yang merupakan turunan dari class **Orang**. Class ini digunakan untuk merepresentasikan objek mahasiswa dengan atribut seperti NRP, kelas, dosen wali, IPK, batas SKS, serta mewarisi atribut nama dari class Orang.
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
    super(nama);
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
public void printInfo() {}

private int hitungBatasSks(double nilaiIpk){
        if (nilaiIpk >= 3.5) return 24;
        if (nilaiIpk >= 3.0) return 22;
        if (nilaiIpk >= 2.5) return 20;
        return 18;
}
```

Abstraction diterapkan melalui metode:
- `printInfo()`:  Class Main cukup memanggil metode ini untuk mendapatkan informasi lengkap mahasiswa tanpa perlu mengetahui bagaimana proses pengolahan datanya.
- `hitungBatasSks()`: Metode ini disembunyikan dari pengguna, sehingga yang diterima hanya hasil akhir berupa jumlah SKS yang sudah valid.

## Encapsulation
**Encapsulation** (enkapsulasi) adalah salah satu konsep penting dalam OOP yang berfungsi untuk menyembunyikan detail implementasi di dalam class dan hanya menampilkan informasi atau fungsi yang diperlukan oleh pengguna.

Melalui enkapsulasi, akses terhadap data dan metode pada suatu kelas dapat dibatasi menggunakan *access modifier*. Beberapa modifier yang sering digunakan antara lain:

- **Private**: Membatasi akses hanya dari dalam kelas itu sendiri.
- **Protected**: Memungkinkan akses dari dalam kelas dan kelas turunannya.
- **Public**: Memungkinkan akses dari luar kelas.

Dengan enkapsulasi, data lebih terlindungi dari perubahan sembarangan, sehingga keamanan, fleksibilitas kode, dan integritas data dalam program dapat lebih terjaga.

### 1. Private
```java
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
**Public di Class Orang**
```java
public Orang(String nama)
public void printInfo()
```
**Public di Class Mahasiswa**
```java
public Mahasiswa(String nama, String nrp, String kelas, String dosenWali, double ipk)

public void printInfo()

public String getNama()
public void setNama(String nama)

public double getIpk()
public void setIpk(double ipk)

public int getBatasSks()
```
**Public di Class Main**
```java
public static void main(String[] args)
```
Method-method tersebut dibuat dengan **modifier public** agar dapat diakses langsung dari luar class.

Dengan demikian, method public berfungsi sebagai perantara agar lass lain dapat berinteraksi dengan data mahasiswa tanpa mengakses langsung variabel internal. Hal ini mendukung prinsip enkapsulasi, di mana data tetap terlindungi (private), sementara akses diberikan secara terkontrol melalui getter, setter, dan method lainnya.

## Inheritance
**Inheritance** (pewarisan) merupakan salah satu konsep utama dalam OOP yang memungkinkan sebuah subclass (kelas anak) untuk mewarisi atribut dan metode dari superclass (kelas induk). 

## Inheritance
**Inheritance** (pewarisan) merupakan salah satu konsep utama dalam OOP yang memungkinkan sebuah subclass (kelas anak) untuk mewarisi atribut dan metode dari superclass (kelas induk).

Pada program ini, konsep inheritance diterapkan melalui:
- Class `Orang` sebagai superclass (class induk)
- Class `Mahasiswa` sebagai subclass (class turunan)

```java
public class Mahasiswa extends Orang
```
Class `Mahasiswa` menggunakan keyword `extends` untuk mewarisi class `Orang`, sehingga atribut `nama` dan method `printInfo()` yang terdapat pada class `Orang` dapat digunakan kembali di dalam class `Mahasiswa`.

## Polymorphism
**Polymorphism** dalam Object Oriented Programming (OOP)merupakan sebuah method atau objek untuk melakukan fungsi yang berbeda meskipun menggunakan nama yang sama. Karena hal itu, Polymorphism memungkinkan program menjadi lebih fleksibel dan mudah dikembangkan. 

## Polymorphism
**Polymorphism** dalam Object Oriented Programming (OOP) merupakan konsep di mana sebuah method atau objek dapat memiliki perilaku yang berbeda meskipun menggunakan nama yang sama. Dengan adanya polymorphism, program menjadi lebih fleksibel dan mudah untuk dikembangkan.

Pada program ini, polymorphism diterapkan melalui **method overriding**, yaitu:
- Method `printInfo()` pada class `Mahasiswa` merupakan hasil override dari method `printInfo()` pada class `Orang`.

```java
@Override
public void printInfo() {
    super.printInfo();
    System.out.println("NRP             : " + nrp);
    System.out.println("Kelas           : " + kelas);
    System.out.println("Dosen Wali      : " + dosenWali);
    System.out.println("IPK Terakhir    : " + ipk);
    System.out.println("Batas SKS       : " + batasSks);
    System.out.println("Status          : " + status);
}
```
Method `printInfo()` pada `class Orang` hanya menampilkan nama, sedangkan pada `class Mahasiswa` method tersebut dikembangkan untuk menampilkan informasi yang lebih lengkap. Meskipun nama method sama, tetapi implementasinya berbeda sesuai dengan kebutuhan class masing-masing.

Dengan demikian, polymorphism memungkinkan penggunaan method yang sama dengan perilaku yang berbeda tergantung pada objek yang digunakan.

# Kode Lengkap
**Class Orang (Parent Class)**
```java
public class Orang {
    protected String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

    public void printInfo() {
        System.out.println("Nama            : " + nama);
    }
}
```
**Class Mahasiswa**:
```java
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
```

**Class Main**:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("===== Sistem Informasi Akademik Mahasiswa =====");

        Mahasiswa m1 = new Mahasiswa("Minji Sastro", "5027261021", "A", "Agus Wijayasena S.Kom., M.Kom.", 3.85);
        System.out.println("Data Mahasiswa 1:");
        m1.printInfo();
        System.out.println("\n--------------------------------\n");

        Mahasiswa m2 = new Mahasiswa("Jewu Malik", "5027261022", "B", "Dr. Indah Wahyuni, S.Kom., M.T.", 3.2);
        System.out.println("Data Mahasiswa 2:");
        m2.printInfo();
        System.out.println("\n----------------------------------\n");

        Mahasiswa m3 = new Mahasiswa("Kevin Wijaya", "5027261025", "B", "Dr. Indah Wahyuni, S.Kom., M.T.", 3.2);
        System.out.println("Data Mahasiswa 3:");
        m3.printInfo();
        System.out.println("\n----------------------------------\n");

        Mahasiswa m4 = new Mahasiswa("Sakha Gemi", "5027261090", "A", "Andi Wijaya, S.Kom., M.T.", 3.55);
        System.out.println("Data Mahasiswa 4:");
        m4.printInfo();
        System.out.println("\n----------------------------------\n");

        Mahasiswa m5 = new Mahasiswa("Maisyaa Avicena", "5027261015", "C", "Budi Santoso S.Kom., M.Kom.", 3.78);
        System.out.println("Data Mahasiswa 5:");
        m5.printInfo();
        System.out.println("\n----------------------------------\n");
    }
}
```
# Output Program
<img width="1046" height="634" alt="Screenshot 2026-04-08 171547" src="https://github.com/user-attachments/assets/f2bc9be7-4de2-472e-b987-0a7c83364547" />
<img width="1044" height="838" alt="Screenshot 2026-04-08 171616" src="https://github.com/user-attachments/assets/e1dca3fd-c64d-4738-bbf8-f52f9c872e4e" />



# Keunikan Program
Ada beberapa keunikan dari program Sistem Informasi Akademik Mahasiswa sederhana yang saya buat, yaitu:
# Keunikan Program
Ada beberapa keunikan dari program Sistem Informasi Akademik Mahasiswa sederhana yang saya buat, yaitu:

- Program ini telah mengimplementasikan keempat pilar utama Object-Oriented Programming (OOP), yaitu Encapsulation, Abstraction, Inheritance, dan Polymorphism secara terintegrasi dalam satu sistem sederhana.

- Program ini memiliki mekanisme perhitungan otomatis. Batas SKS tidak ditentukan oleh pengguna, melainkan dihitung secara dinamis oleh sistem berdasarkan nilai IPK melalui method private `hitungBatasSks`, sehingga logika perhitungan tetap tersembunyi (abstraction).

- Program ini menerapkan enkapsulasi lanjutan pada method `setIpk()`. Ketika nilai IPK diubah, sistem secara otomatis memperbarui batas SKS, sehingga menjaga konsistensi data tanpa perlu intervensi langsung dari pengguna.

- Program ini menerapkan konsep inheritance melalui class `Mahasiswa` yang mewarisi class `Orang`. Dengan demikian, atribut `nama` dan method dasar tidak perlu ditulis ulang, sehingga kode menjadi lebih efisien dan reusable.

- Program ini mengimplementasikan polymorphism melalui method `printInfo()` yang dioverride pada class `Mahasiswa`. Method yang sama memiliki perilaku berbeda, di mana class `Orang` hanya menampilkan nama, sedangkan class `Mahasiswa` menampilkan informasi yang lebih lengkap.

- Program ini memiliki atribut `status` yang secara otomatis diinisialisasi dengan nilai "Aktif" pada setiap objek baru, sehingga mencerminkan sistem administratif yang efisien dan realistis.

- Metode perhitungan SKS dibuat dengan modifier **private** agar class lain tidak memiliki akses untuk mengubah atau memodifikasi rumus perhitungan. Dengan demikian, aturan akademik tetap terjaga, aman, dan konsisten di dalam sistem.
