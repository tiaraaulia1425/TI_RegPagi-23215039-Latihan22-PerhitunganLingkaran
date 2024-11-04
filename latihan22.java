package pertemuan5new;

/**
 *
 * Nama : Tiara Aulia Maharani
 * NIM  : 23215039
 * TEKNIK INFORMATIKA
 * program untuk menghitung jari-jari, 
 * luas, dan keliling lingkaran berdasarkan input diameter
 */

  import java.util.Scanner;
public class latihan22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====Perhitungan Lingkaran====");
        System.out.print("Masukkan nilai diameter lingkaran: ");

        if (!input.hasNextDouble()) {
            System.out.println("Nilai Diameter Tidak Sesuai");
        } else {
            double diameter = input.nextDouble();
            if (diameter <= 0) {
                System.out.println("Nilai Diameter Tidak Sesuai");
            } else {
                double jariJari = diameter / 2;
                double luas = Math.PI * jariJari * jariJari;
                double keliling = Math.PI * diameter;

                System.out.println("====Hasil Perhitungan Lingkaran====");
                System.out.printf("Jari-jari Lingkaran = %.2f cm%n", jariJari);
                System.out.printf("Luas Lingkaran = %.2f cm²%n", luas);
                System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);
            }
        }

        input.close();
    }
}
  

