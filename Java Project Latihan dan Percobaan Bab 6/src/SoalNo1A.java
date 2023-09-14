    import java.io.BufferedReader; 
    import java.io.InputStreamReader; 
    import java.io.IOException; 
    import javax.swing.JOptionPane;

    public class SoalNo1A
    { 
    public static void main( String[] args ){ 

    BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
    
    int a,b,c;
    int average;
    
    try{ 
        System.out.print("Masukkan Nilai Ujian pertama :");
        a = Integer.parseInt(dataIn.readLine()); 
        
        System.out.print("Masukkan Nilai Ujian kedua :");
        b = Integer.parseInt(dataIn.readLine());

        System.out.print("Masukkan Nilai Ujian kedua :");
        c = Integer.parseInt(dataIn.readLine());

        average = (a+b+c)/3;
        System.out.println("Nilai Rata ratanya adalah :" + average);

        if (average >= 60) {
            System.out.println(":-)");
        } else {
            System.out.println(":-(");
        }
    }catch(IOException e) {
        System.out.println("Error");
    }
    
    }
}


