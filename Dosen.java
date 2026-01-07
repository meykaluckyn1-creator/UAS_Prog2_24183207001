// Menunjukkan hierarchical inheritance
public class Dosen extends User {

    // Atribut private
    private String mataKuliah;

    // Constructor default
    public Dosen() {
    }

    // Constructor dengan parameter
    public Dosen(String id, String nama, String mataKuliah) {
        super(id, nama);
        this.mataKuliah = mataKuliah;
    }

    @Override
    public void tampilInfo() {
        System.out.println("ID Dosen  : " + id);
        System.out.println("Nama      : " + nama);
        System.out.println("Mengampu  : " + mataKuliah);
    }
}
