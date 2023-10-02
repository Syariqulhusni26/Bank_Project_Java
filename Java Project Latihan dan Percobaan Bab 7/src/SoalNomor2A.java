import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoalNomor2A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nomor ke-" + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println( numbers[i]);
        }

        int max = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Nilai terbesar yang Anda masukkan adalah: " + max);
    }
}