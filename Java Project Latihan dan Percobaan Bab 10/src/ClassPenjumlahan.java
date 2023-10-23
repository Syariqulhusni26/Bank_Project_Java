//Bismillahirrahmanirrahim
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassPenjumlahan {
    public static class penjumlahan {

        private int nilaiA;
        private int nilaiB;
        private int tambah;

        public penjumlahan() {

        }

        //membuat constructor pada class penjumlahan
        public penjumlahan(int nilaiA, int nilaiB) {
            this.nilaiA = nilaiA;
            this.nilaiB = nilaiB;
            
        }

        //membuat  accessor method pada class penjumlahan
        public int getNilaiA() {
            return nilaiA;
        }

        public int getNilaiB() {
            return nilaiB;
        }

        public int getTambah() {
            return tambah;
        }

        //Membuat mutator pada class penjumlahan

        public void setNilaiA(int nilaiA) {
                this.nilaiA = nilaiA;
        }
        public void setNilaiB(int nilaiB) {
                this.nilaiB = nilaiB;
        }

        //membuat method untuk penjumlahan
        public int pertambahan() {
            
            tambah = nilaiA + nilaiB;
            return tambah;
        }

        //membuat method untuk mencetak tampilan
        public String tampilkan() {
            return "\nNilai A = " + nilaiA + "\nNilai B = " + nilaiB + "\nHasil dari nilai A dan B adalah : " + tambah;
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        penjumlahan Penjumlahan = new penjumlahan();

        //memberi nilai penjumlahan dan Pemanggilan method

        System.out.println("Masukkan Nilai A ");
        Penjumlahan.setNilaiA(26);
        Penjumlahan.setNilaiB(98);
        Penjumlahan.pertambahan();
        
        //Menampilkan nilai pada penjumlahan
        
        System.out.println(Penjumlahan.tampilkan());
    }
}