import javax.swing.JOptionPane;

public class InputanKeyboard4 {
    public static void main (String[] args) {
        String a = "";
        a = JOptionPane.showInputDialog("Enter word 1 : ");

        String b = "";
        b = JOptionPane.showInputDialog("Enter word 2 : ");

        String c = "";
        c = JOptionPane.showInputDialog("Enter word 3 : ");
        
        String msg = a + b + c;
        


        JOptionPane.showMessageDialog(null, msg);
    }
}
