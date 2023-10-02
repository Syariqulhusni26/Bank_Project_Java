import javax.swing.JOptionPane;

public class SoalNo4C {
    public static void main(String[] args) {
        
        double a;
        int b; 

        String angka = JOptionPane.showInputDialog("Masukkan Angka : ");
        a = Double.parseDouble(angka); 

        String pangkat = JOptionPane.showInputDialog("Masukkan Nilai Pangkat");
        b = Integer.parseInt(pangkat); 

        double hasil = 1;
        
        for(int x = 1; x <= b; x++)
        {
            hasil *= a;
        }
        String selesai = a + "Pangkat" + b + "=" + hasil ;
        JOptionPane.showMessageDialog(null, selesai);
    }
}
