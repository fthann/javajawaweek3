import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input jumlah nilai
        System.out.println("Masukan jumlah nilai: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;

        // input nilai nilai dan simpan di array
        for (int i = 0; i < jumlah; i++) {
            System.out.println("masukan nilai ke- " + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        // hitung rata rata
        double rataRata = (double) total / jumlah;

        // tampilkan hasil
        System.out.println("Rata rata nilai adalah: " + rataRata);
    }
}