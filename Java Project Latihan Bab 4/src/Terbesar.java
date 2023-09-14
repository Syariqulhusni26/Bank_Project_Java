public class Terbesar {
    public static void main(String[] args) {

        int a = 10;
        int b = 23;
        int c = 5;
        int status = 0;

        status = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("Nilai tertingginya adalah angka = " + status);
    }
}
