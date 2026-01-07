
public class Nilai implements Penilaian {

    // Atribut private
    private double tugas;
    private double uts;
    private double uas;

    // Constructor default
    public Nilai() {
    }

    // Constructor dengan parameter
    public Nilai(double tugas, double uts, double uas) {
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    // Implementasi method dari interface
    @Override
    public double hitungNilaiAkhir() {
        // Perhitungan nilai akhir
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    // Method untuk menentukan nilai huruf
    public char getNilaiHuruf() {
        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 85) {
            return 'A';
        } else if (nilaiAkhir >= 70) {
            return 'B';
        } else if (nilaiAkhir >= 55) {
            return 'C';
        } else {
            return 'D';
        }
    }
}
