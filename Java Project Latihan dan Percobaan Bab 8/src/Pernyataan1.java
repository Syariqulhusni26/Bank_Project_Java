/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
/**
 *
 * @author M
 */
public class Pernyataan1 {
    public static void main(String[] args) {
        
        int a, b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
     
        int tambah = a + b; 
        int kurang = a - b; 
        int kali = a * b;   
        int bagi = a / b;   
        System.out.println("Java ArithmeticOperation " + a + b ); 
        
        System.out.println("Sum = " + tambah); 
        System.out.println("Difference = " + kurang ); 
        System.out.println("Product = " + kali); 
        System.out.println("Quotie " + bagi);
        System.out.println(args[2]);
        
        
    }
}
