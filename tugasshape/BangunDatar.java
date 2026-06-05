package tugasshape;

public abstract class BangunDatar {
    protected int jumlahSisi;
    protected int x;
    protected int y;

    public BangunDatar(int sisi) {
        this.jumlahSisi = sisi;
    }

    public void pindahkan(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public abstract void draw();

    public abstract void resize();

    public abstract double getLuas();

    public abstract double getKeliling();

    public int getJumlahSisi() {
        return this.jumlahSisi;
    }
}