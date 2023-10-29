
public class ClassKdanLPersegi {

        private int sisi;

        public ClassKdanLPersegi () {
                // ini adalah construktor default berguna untuk melakukan 
                //inisialisasi awal pada objek yang pertama kali di ciptakan
        }

        public ClassKdanLPersegi(int sisi) {
            this.sisi = sisi;
        }


        //membuat method untuk mencari luas
        public int hitungluas() {
            Aritmatika Hluas = new Aritmatika();
            int luas = Hluas.getPerkalian(sisi, sisi);
            return luas;
        }

        public int hitungkeliling() {
            Aritmatika Hluas = new Aritmatika();
            int luas = Hluas.getPerkalian(4,sisi);
            return luas;
        }
}