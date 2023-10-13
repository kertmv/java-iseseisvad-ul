import java.util.Scanner;

public class java22 {

    public static void main(String[] args) {
    
        System.out.println("nimi\tvanus\tsugu");
        
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Sisesta oma nimi: ");
            String nimi = scanner.nextLine();
            System.out.println(nimi + "\t17\tm");

            scanner.close();
        } catch (Exception e) {
            System.out.println("Viga sisendi lugemisel: " + e.getMessage());
        }
    }
}
