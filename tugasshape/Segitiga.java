package tugasshape;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        super(3);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar Segitiga");
    }

    @Override
    public void resize() {
        System.out.println("Mengubah ukuran Segitiga");
    }

    @Override
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double getKeliling() {
        return 3 * alas;
    }
}