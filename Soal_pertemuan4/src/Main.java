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