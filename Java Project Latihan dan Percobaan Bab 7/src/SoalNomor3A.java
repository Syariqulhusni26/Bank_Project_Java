public class SoalNomor3A {
    public static void main(String[] args) {
        
        String entry[][] = 
        {
        {"Florence","735-1234", "Manila"},
        {"Joyce","983-333", "Quezon City"},
        {"Becca","456-332", "Manila"}
        };

        for (int x = 0; x< entry.length; x++) {

            String orang[] = entry[x];
            System.out.println("Name :" + orang[0]);
            System.out.println("tel :" + orang[1]);
            System.out.println("Address :" + orang[2]);
        }
        
    }
}
