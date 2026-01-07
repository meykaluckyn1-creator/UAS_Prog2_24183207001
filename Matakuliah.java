
public class Matakuliah {

    // Atribut private (encapsulation)
    private String namaMatkul;
    private int sks;

    // Constructor default
    public Matakuliah() {
    }

    // Constructor dengan parameter
    public Matakuliah(String namaMatkul, int sks) {
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    // Getter dan Setter
    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    // Method untuk menampilkan data mata kuliah
    public void tampilInfo() {
        System.out.println("Mata Kuliah : " + namaMatkul);
        System.out.println("SKS         : " + sks);
    }
}
