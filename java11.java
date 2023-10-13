import java.util.Scanner;

public class java11 {
    public static void main
    (String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("See programm annab sulle 1kuni66 arvud ja nad koik jagunevad 3-ka");
            System.out.println("vajuta enterit palun.");
            scanner.nextLine();

            for (int i = 1; i <= 66; i++) {
                if (i % 3 == 0) {
                    System.out.print(i);
                    if (i < 66 - 2) {
                        System.out.print(", ");
                    }
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Viga: " + e.getMessage());
        }
    }
}
