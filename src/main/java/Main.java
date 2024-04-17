import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj znak:");
        char znak = scanner.next().charAt(0);

        System.out.println("Podaj liczbę wierszy:");
        int liczbaWierszy = scanner.nextInt();

        
        char[][] macierz = new char[liczbaWierszy][];
        for (int i = 0; i < liczbaWierszy; i++) {
            macierz[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                macierz[i][j] = znak;
            }
        }

  
        System.out.println("Wygenerowany blok znaków:");
        for (int i = 0; i < liczbaWierszy; i++) {
            for (int j = 0; j < macierz[i].length; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
