    import java.io.BufferedReader; 
    import java.io.InputStreamReader; 
    import java.io.IOException; 
    public class InputanKeyboard2 
    { 
    public static void main( String[] args ){ 
    
    BufferedReader dataIn = new BufferedReader(new 
    InputStreamReader( System.in) ); 
    String a = ""; 
    String b = ""; 
    String c = ""; 
    
    System.out.print("Enter word1 : "); 
    try{ 
    a = dataIn.readLine(); 
    }catch( IOException e ){ 
    System.out.println("Error!"); 
    } 

    System.out.print("Enter word2 : "); 
    try{ 
    b = dataIn.readLine(); 
    }catch( IOException e ){ 
    System.out.println("Error!"); 
    } 
    System.out.print("Enter word3 : ");
    try{ 
    c = dataIn.readLine(); 
    }catch( IOException e ){ 
    System.out.println("Error!"); 
    } 


    System.out.println("Enter word1 : " + a); 
    System.out.println("Enter word2 : " + b); 
    System.out.println("Enter word3 : " + c); 
    System.out.print(a ); 
    System.out.print(b ); 
    System.out.print(c ); 
    } 
    } 
