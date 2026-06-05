package tugasshape;

public class BangunDatarMain {
    public static void main(String[] args) {
        Kotak kotak = new Kotak(4, 5);
        Segitiga segitiga = new Segitiga(6, 4);

        System.out.println("--- KOTAK ---");
        System.out.println("Jumlah Sisi: " + kotak.getJumlahSisi());
        System.out.println("Luas Kotak: " + kotak.getLuas());
        System.out.println("Keliling Kotak: " + kotak.getKeliling());

        System.out.println("\n--- SEGITIGA ---");
        System.out.println("Jumlah Sisi: " + segitiga.getJumlahSisi());
        System.out.println("Luas Segitiga: " + segitiga.getLuas());
        System.out.println("Keliling Segitiga (Sama Sisi): " + segitiga.getKeliling());

        System.out.println("--- Ukuran Semula ---");
        System.out.println("Luas: " + kotak.getLuas());
        System.out.println("Keliling: " + kotak.getKeliling());

        System.out.println("\n--- Proses Resize ---");
        kotak.resize(2.0);

        System.out.println("\n--- Setelah Resize 2x ---");
        System.out.println("Luas Baru: " + kotak.getLuas());
        System.out.println("Keliling Baru: " + kotak.getKeliling());
    }
}