import java.util.Scanner;

public class java19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sisestage kümnendsüsteemi arv: ");
        int decimal = scanner.nextInt();
        
        String binary = decimalToBinary(decimal);
        
        System.out.println("Kahendsüsteemi teisendus: " + binary);
        
        scanner.close();
    }
    
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); // Lisame kahendsüsteemi binaarstringi algusesse
            decimal = decimal / 2;
        }
        
        return binary.toString();
    }
}
