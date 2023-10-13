import java.util.Scanner;

public class java16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Sisesta palun arvude arv: ");
        int arvudeArv = sc.nextInt();
        
        int summa = 0;
        
        for (int i = 1; i <= arvudeArv; i++) {
            System.out.print("Sisesta arv " + i + ": ");
            int arv = sc.nextInt();
            summa += arv;
        }
        
        double keskmine = (double) summa / arvudeArv;
        
        System.out.println("Summa: " + summa);
        System.out.println("Keskmine: " + keskmine);
        
        sc.close();
    }
}
