import javax.swing.JOptionPane;

public class SoalNo1B {
    public static void main(String[] args) {
        
        int a, b, c;
        int average;

        String nilaiA = JOptionPane.showInputDialog("Masukkan Nilai ujian Pertama");
        a = Integer.parseInt(nilaiA);

        String nilaiB = JOptionPane.showInputDialog("Masukkan Nilai ujian kedua");
        b = Integer.parseInt(nilaiB);

        String nilaiC = JOptionPane.showInputDialog("Masukkan Nilai ujian ketiga");
        c = Integer.parseInt(nilaiC);

        average = (a+b+c)/3;

        String rata = "Nilai rata rata anda adalah :" + average + "";

        JOptionPane.showMessageDialog(null, rata);

        if (average >= 60) {
            String lulus = ":-)";
            JOptionPane.showMessageDialog(null, lulus);
        } else {
            String gagal = ":-)";
            JOptionPane.showMessageDialog(null, gagal);
        }
    }
}