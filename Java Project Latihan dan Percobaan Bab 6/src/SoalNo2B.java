import javax.swing.JOptionPane;

public class SoalNo2B {
    public static void main(String[] args) {
        
        int a;

        String angkaA = JOptionPane.showInputDialog("Masukkan Angka Anda : ");
        a = Integer.parseInt(angkaA);

        switch(a) {
            case 1:
            String Satu = "Satu";
            JOptionPane.showMessageDialog(null, Satu);
            break;

            case 2:
            String Dua = "Dua";
            JOptionPane.showMessageDialog(null, Dua);
            break;

            case 3:
            String Tiga = "Tiga";
            JOptionPane.showMessageDialog(null, Tiga);
            break;

            case 4:
            String Empat = "Empat";
            JOptionPane.showMessageDialog(null, Empat);
            break;

            case 5:
            String Lima = "Lima";
            JOptionPane.showMessageDialog(null, Lima);
            break;

            case 6:
            String Enam = "Enam";
            JOptionPane.showMessageDialog(null, Enam);
            break;

            case 7:
            String Tujuh = "Tujuh";
            JOptionPane.showMessageDialog(null, Tujuh);
            break;

            case 8:
            String Delapan = "Delapan";
            JOptionPane.showMessageDialog(null, Delapan);
            break;

            case 9:
            String Sembilan = "Sembilan";
            JOptionPane.showMessageDialog(null, Sembilan);
            break;

            case 10:
            String Sepuluh = "Sepuluh";
            JOptionPane.showMessageDialog(null, Sepuluh);
            break;

        default :
            String Invalid = "Invalid Number";
            JOptionPane.showMessageDialog(null, Invalid);

        }
    }
}