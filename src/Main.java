import java.util.Scanner;

/**
 * Program ini menghitung luas permukaan kubus
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        double luasPermukaan = hitungLuasPermukaanKubus(sisi);

        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);
    }

    /**
     *
     * @param sisi Panjang sisi kubus.
     * @return Luas permukaan kubus.
     *
     */
    public static double hitungLuasPermukaanKubus(double sisi) {
        // Menggunakan rumus luas permukaan kubus
        double luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
}

