import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ArrayList untuk menyimpan object
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        ArrayList<Dosen> listDosen = new ArrayList<>();
        ArrayList<Matakuliah> listMatkul = new ArrayList<>();
        ArrayList<Nilai> listNilai = new ArrayList<>();

        int pilih;

        // Perulangan menu
        do {
            System.out.println("\n=== SISTEM AKADEMIK ===");
            System.out.println("1. Input Mahasiswa");
            System.out.println("2. Input Dosen");
            System.out.println("3. Input Mata Kuliah");
            System.out.println("4. Input Nilai Mahasiswa");
            System.out.println("5. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                case 1:
                    // Input data mahasiswa
                    System.out.print("NPM     : ");
                    String npm = input.nextLine();
                    System.out.print("Nama    : ");
                    String nama = input.nextLine();
                    System.out.print("Jurusan : ");
                    String jurusan = input.nextLine();

                    listMahasiswa.add(new Mahasiswa(npm, nama, jurusan));
                    break;

                case 2:
                    // Input data dosen
                    System.out.print("ID Dosen : ");
                    String id = input.nextLine();
                    System.out.print("Nama     : ");
                    String namaD = input.nextLine();
                    System.out.print("Matkul   : ");
                    String mkAmpu = input.nextLine();

                    listDosen.add(new Dosen(id, namaD, mkAmpu));
                    break;

                case 3:
                    // Input mata kuliah
                    System.out.print("Nama Mata Kuliah : ");
                    String namaMk = input.nextLine();
                    System.out.print("Jumlah SKS       : ");
                    int sks = input.nextInt();

                    listMatkul.add(new Matakuliah(namaMk, sks));
                    break;

                case 4:
                    // Input nilai mahasiswa
                    System.out.print("Nilai Tugas: ");
                    double tugas = input.nextDouble();
                    System.out.print("Nilai UTS  : ");
                    double uts = input.nextDouble();
                    System.out.print("Nilai UAS  : ");
                    double uas = input.nextDouble();

                    Nilai nilai = new Nilai(tugas, uts, uas);
                    listNilai.add(nilai);

                    System.out.println("Nilai Akhir : " + nilai.hitungNilaiAkhir());
                    System.out.println("Nilai Huruf : " + nilai.getNilaiHuruf());
                    break;

                case 5:
                    // Menampilkan seluruh data
                    System.out.println("\n=== DATA MAHASISWA ===");
                    for (User u : listMahasiswa) {
                        u.tampilInfo(); // polymorphism
                        System.out.println("----------------");
                    }

                    System.out.println("\n=== DATA DOSEN ===");
                    for (User u : listDosen) {
                        u.tampilInfo();
                        System.out.println("----------------");
                    }

                    System.out.println("\n=== DATA MATA KULIAH ===");
                    for (Matakuliah mk : listMatkul) {
                        mk.tampilInfo();
                        System.out.println("----------------");
                    }

                    System.out.println("\n=== DATA NILAI ===");
                    for (Nilai n : listNilai) {
                        System.out.println("Nilai Akhir : " + n.hitungNilaiAkhir());
                        System.out.println("Nilai Huruf : " + n.getNilaiHuruf());
                        System.out.println("----------------");
                    }

                    System.out.println("Total Mahasiswa: " + Mahasiswa.totalMahasiswa);
                    break;
            }

        } while (pilih != 0);

        System.out.println("Program selesai.");
    }
}
