// Menggunakan inheritance (extends)
public class Mahasiswa extends User {

    // Atribut private untuk encapsulation
    private String npm;
    private String jurusan;

    // Static variable untuk menghitung total mahasiswa
    public static int totalMahasiswa = 0;

    // Constructor default
    public Mahasiswa() {
        totalMahasiswa++;
    }

    // Constructor dengan parameter
    public Mahasiswa(String npm, String nama, String jurusan) {
        super(null, nama);
        this.npm = npm;
        this.jurusan = jurusan;
        totalMahasiswa++;
    }

    // Getter dan Setter
    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    @Override
    public void tampilInfo() {
        System.out.println("NPM     : " + npm);
        System.out.println("Nama    : " + nama);
        System.out.println("Jurusan : " + jurusan);
    }
}
