import javax.swing.JOptionPane;

public class SoalNo2A {
    public static void main(String[] args) {
        
        int a;

        String angkaA = JOptionPane.showInputDialog("Masukkan Angka Anda : ");
        a = Integer.parseInt(angkaA);

        if(a==1){
            String satu = "Satu";
            JOptionPane.showMessageDialog(null, satu);
        }
        if(a==2){
            String dua = "dua";
            JOptionPane.showMessageDialog(null, dua);
        }
        if(a==3){
            String tiga = "tiga";
            JOptionPane.showMessageDialog(null, tiga);
        }
        if(a==4){
            String empat = "empat";
            JOptionPane.showMessageDialog(null, empat);
        }
        if(a==5){
            String lima = "lima";
            JOptionPane.showMessageDialog(null, lima);
        }
        if(a==6){
            String enam = "enam";
            JOptionPane.showMessageDialog(null, enam);
        }
        if(a==7){
            String tujuh = "tujuh";
            JOptionPane.showMessageDialog(null, tujuh);
        }
        if(a==8){
            String delapan = "delapan";
            JOptionPane.showMessageDialog(null, delapan);
        }
        if(a==9){
            String sembilan = "sembilan";
            JOptionPane.showMessageDialog(null, sembilan);
        }
        if(a==10){
            String sepuluh = "sepuluh";
            JOptionPane.showMessageDialog(null, sepuluh);
        }else{
            String invalid = "Invalid Number";
            JOptionPane.showMessageDialog(null, invalid);
        }
    }
}