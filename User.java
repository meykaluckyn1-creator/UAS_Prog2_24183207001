// Abstract class User sebagai class induk
public abstract class User {
    // Atribut protected agar bisa diakses oleh class turunan
    protected String id;
    protected String nama;

    // Constructor default
    public User() {
    }

    // Constructor dengan parameter
    public User(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Method abstract
    public abstract void tampilInfo();
}
