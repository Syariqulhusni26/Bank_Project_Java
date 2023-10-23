//Objek untuk mencari keliling persegi panjang
public class ClassKdanLPersegi {
    public static class keliling {

        private int sisi;
        private int tambah;

        public keliling() {

        }

        //membuat constructor pada class keliling
        public keliling(int sisi) {
            this.sisi = sisi;
            
            
        }

        //membuat  accessor method pada class keliling
        public int getSisi() {
            return sisi;
        }

        public int getTambah() {
            return tambah;
        }

        //Membuat mutator pada class keliling

        public void setSisi(int sisi) {
                this.sisi = sisi;
        }
        

        //membuat method untuk keliling
        public int pertambahan() {
            
            tambah = sisi + sisi + sisi + sisi;
            return tambah;
        }

        //membuat method untuk mencetak tampilan
        public String tampilkanKeliling() {
            return "Keliling dari persegi dengan panjang sisi " + sisi +" adalah : " + tambah ;
        }
    }

    //Objek untuk mengalikan luas persegi panjang
    public static class luas {

        private int sisi;
        private int kali;

        public luas() {

        }

        //membuat constructor pada class keliling
        public luas(int sisi) {
            this.sisi = sisi;
            
            
        }

        //membuat  accessor method pada class keliling
        public int getSisi() {
            return sisi;
        }

        public int getKali() {
            return kali;
        }

        //Membuat mutator pada class keliling

        public void setSisi(int sisi) {
                this.sisi = sisi;
        }
        

        //membuat method untuk keliling
        public int perkalian() {
            
            kali = 4 * sisi;
            return kali;
        }

        //membuat method untuk mencetak tampilan
        public String tampilkanLuas() {
            return "Luas dari persegi dengan panjang sisi " + sisi +" adalah : " + kali ;
        }
    }

    public static void main(String[] args) {
        //Pembuatan objek dari class objek 
        keliling TambahKeliling = new keliling();
        luas KaliLuas = new luas();

        //Nilai untuk luas persegi panjang
        KaliLuas.setSisi(12);
        KaliLuas.perkalian();

        //Nilai untuk keliling persegi panjang
        TambahKeliling.setSisi(90);
        TambahKeliling.pertambahan();


        //pemanggilan method untuk mencetak hasil luas dan keliling
        System.out.println(KaliLuas.tampilkanLuas());
        System.out.println(TambahKeliling.tampilkanKeliling());
        
        
    }
}
