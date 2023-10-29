//Bismillahirrahmanirrahim
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aritmatika {
    

        private int nilaiA;
        private int nilaiB;
        public Aritmatika() {

        }

        //membuat constructor pada class artimatika
        public Aritmatika(int nilaiA, int nilaiB) {
            this.nilaiA = nilaiA;
            this.nilaiB = nilaiB;
            
        }

        //Membuat mutator pada class artimatika

        public void setNilaiA(int nilaiA) {
                this.nilaiA = nilaiA;
        }
        public void setNilaiB(int nilaiB) {
                this.nilaiB = nilaiB;
        }

        //membuat method untuk artimatika
        public int getPertambahan(int nilaiA, int nilaiB) {
            
            return nilaiA + nilaiB;
        }
        public int getPengurangan(int nilaiA, int nilaiB) {
            
            return nilaiA - nilaiB;
        }
        public int getPerkalian(int nilaiA, int nilaiB) {
            
            return nilaiA * nilaiB;
        }
        public int getPembagian(int nilaiA, int nilaiB) {
            
            return nilaiA / nilaiB;
        }
        

        //membuat method untuk mencetak tampilan
        public String tampilkantambah() {
            return "\nNilai A = " + nilaiA + "\nNilai B = " + nilaiB + "\nHasil dari nilai A dan B adalah : " + (nilaiA + nilaiB);
        }
        //membuat method untuk mencetak tampilan
        public String tampilkurang() {
            return "\nNilai A = " + nilaiA + "\nNilai B = " + nilaiB + "\nHasil dari nilai A dan B adalah : " + (nilaiA - nilaiB);
        }
        //membuat method untuk mencetak tampilan
        public String tampilkali() {
            
            return "\nNilai A = " + nilaiA + "\nNilai B = " + nilaiB + "\nHasil dari nilai A dan B adalah : " + (nilaiA *nilaiB);
            
        }
        //membuat method untuk mencetak tampilan
        public String tampilbagi() {
            return "\nNilai A = " + nilaiA + "\nNilai B = " + nilaiB + "\nHasil dari nilai A dan B adalah : " + (nilaiA / nilaiB);
        }
    
    public static void main(String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        Aritmatika artimatika = new Aritmatika();

        //memberi nilai artimatika dan Pemanggilan method

        System.out.println("Masukkan Nilai A ");
        artimatika.setNilaiA(26);
        artimatika.setNilaiB(98);
        artimatika.getPerkalian(26, 98);
        
        //Menampilkan nilai pada artimatika
        
        System.out.println(artimatika.tampilkali());
    }
}