package tugasshape;

public class Kotak extends BangunDatar implements Resizeable {
    private double panjang;
    private double lebar;

    public Kotak(double panjang, double lebar) {
        super(4);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar Kotak");
    }

    @Override
    public void resize() {
        System.out.println("Mengubah ukuran Kotak");
    }

    @Override
    public void resize(double factor) {
        this.panjang = this.panjang * factor;
        this.lebar = this.lebar * factor;
        System.out.println("Ukuran Kotak berhasil diubah sebesar " + factor + "x");
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }

    @Override
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

}
