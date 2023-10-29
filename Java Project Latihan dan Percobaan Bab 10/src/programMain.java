public class programMain {
    public static void main(String[] args) {
        ClassKdanLPersegi persegi = new ClassKdanLPersegi(10);
        Aritmatika aritmatika = new Aritmatika();
        Kubus kubus = new Kubus(10);
        LimasSegiEmpat limassegiempat = new LimasSegiEmpat(10, 5);

        System.out.println("Hasil Luas persegi = " + persegi.hitungluas());
        System.out.println("Hasil keliling persegi = " + persegi.hitungkeliling());
        System.out.println("Hasil penjumlahan adalah = " + aritmatika.getPertambahan(10,20));
        System.out.println("Hasil volume kubus adalah = " + kubus.hitungvolume());
        System.out.println("Hasil luas permukaan kubus adalah = " + kubus.Hitungluas());
        System.out.println("Hasil luas permukaan limas adalah = " + limassegiempat.getLuas());
        System.out.println("Hasil volume permukaan limas adalah = " + limassegiempat.getVolume());

    }
}
