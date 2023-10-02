import javax.swing.JOptionPane; 

public class SoalNomor2B {
    public static void main(String[] args) {
        
        int numbers[] = new int[10];
        int i = 0;

        for(i = 0 ; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke- " + (i + 1) + ":");
            numbers[i] = Integer.parseInt(input);
        }
        
        int max = numbers[0];

        for (int j = 1; j < 10; j++) {
            if(numbers[j] < max) {
                max = numbers[j];
            }
        }
        
        JOptionPane.showMessageDialog(null,"Nilai Terbesar dari array ini adalah = " + max);
    }
}
