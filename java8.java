import java.util.Scanner;

public class java8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Sisesta lause:");
        String sisendLause = scanner.nextLine();
        
        String[] sonad = sisendLause.split(" ");
        StringBuilder tagurpidiLause = new StringBuilder();
        
        for (int i = sonad.length - 1; i >= 0; i--) {
            tagurpidiLause.append(sonad[i]).append(" ");
        }
        
        System.out.println("Tagurpidi lause: " + tagurpidiLause.toString().trim());
        
        scanner.close();
    }
}
