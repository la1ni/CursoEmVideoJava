//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = teclado.nextInt();
        if (idade < 16) {
            System.out.println("Voto proibido");
        } else {
            if ((idade >= 16 && idade <= 18) || (idade >= 70)) {
                System.out.println("Voto opcional!");
            } else {
                System.out.println("Voto obrigatório");
            }
        }
    }
}