import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,hipotenus,alan;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen üçgenin a kenarının uzunluğunu giriniz: ");
        a = input.nextInt();

        System.out.println("Lütfen üçgenin b kenarının uzunluğunu giriniz: ");
        b = input.nextInt();

        System.out.println("Hipotenus kenar uzunluğunu giriniz: ");
        hipotenus = input.nextInt();
        alan = (a*hipotenus)/2;
        System.out.println("Üçgenin alanı: " + alan);

    }
}