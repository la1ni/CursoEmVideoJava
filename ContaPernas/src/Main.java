import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quantas pernas tem o ser em questão? ");
    int numPernas = teclado.nextInt();
    String tipo = switch (numPernas) {
        case 0 -> "Ameba";
        case 1 -> "Saci";
        case 2 -> "Dinossauro bípede";
        case 4 -> "Gatinho A A Folou";
        case 6, 8 -> "Aranha";
        case 9 -> "Sleipnir";
        case 100 -> "Centopeia";
        default -> "Extraterrestre";
    };
        System.out.println("O tipo do ser/bicho/entidade digitado é "+ tipo);
    }
}
