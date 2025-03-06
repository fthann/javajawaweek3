import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // // input jumlah nilai
        // System.out.println("Masukan jumlah nilai: ");
        // int jumlah = input.nextInt();

        // int[] nilai = new int[jumlah];
        // int total = 0;

        // // input nilai nilai dan simpan di array
        // for (int i = 0; i < jumlah; i++) {
        //     System.out.println("masukan nilai ke- " + (i + 1) + ": ");
        //     nilai[i] = input.nextInt();
        //     total += nilai[i];
        // }

        // // hitung rata rata
        // double rataRata = (double) total / jumlah;

        // // tampilkan hasil
        // System.out.println("Rata rata nilai adalah: " + rataRata);

        // Matriks A
        int[][] matriksA = {
            {1,2},
            {3,4}
        };
        

        // Matriks B
        int[][] matriksB = {
            {5,6},
            {7,8}
        };    


        // matriks hasil pennjumlahan
        int[][] hasil = new int[2][2];

        // proses penjumlahan
        for (int baris = 0; baris < matriksA.length; baris++) {
            for (int kolom = 0; kolom < matriksA[baris].length; kolom++) {
                hasil[baris][kolom] = matriksA[baris][kolom] + matriksB[baris][kolom];
            }
        }

        // tampilkan matriks a
        System.out.println("Matriks A");
        for (int[] baris : matriksA) {
            for (int angka : baris) {
                System.out.println(angka + " ");
            }
            System.out.println();
        }

        // tampilkan matriks B
        System.out.println("\nMatriks B");
        for (int[] baris : matriksB) {
            for (int angka : baris) {
                System.out.println(angka + " ");
            }
            System.out.println();
        }

        // tampilkan hasil penjumlahan
        System.out.println("\nHasil Penjumlahan: ");
        for (int[] baris : hasil) {
            for (int angka : baris) {
                System.out.println(angka + " ");
            }
        }
    }
}