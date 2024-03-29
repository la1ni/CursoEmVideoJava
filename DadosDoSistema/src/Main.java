import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Main {
    public static String ConverteMes(int mes_errado) {
        ArrayList<String> listaDeMeses = new ArrayList<>(List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"));
        return (listaDeMeses.get(mes_errado));
    }
    public static void ChamaData(boolean sinal) {
        Calendar relogio = Calendar.getInstance();
        System.out.println("Dia: "+ relogio.DAY_OF_MONTH);
        System.out.println("Mês: "+ ConverteMes(relogio.MONTH));
        System.out.println("Ano de nosso Senhor: "+ relogio.get(Calendar.YEAR));
    }
    public static void ChamaLinguagem(boolean sinal) {
        Locale localiza = Locale.getDefault();
        String idioma = localiza.getLanguage();
        System.out.println("A linguagem do seu sistem é "+idioma);
    }

    public static void ChamaResolucao(boolean sinal) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension tela = toolkit.getScreenSize();
        int altura = tela.width;
        int largura = tela.height;
        System.out.println("Sua tela tem "+ altura + "x"+ largura+"... Uau!");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vou pegar alguns dados do seu sistema...\nDigite 1 para ver a data atual: ");
        int continuar = Integer.parseInt(teclado.nextLine());
        if (1 != continuar) {
            System.out.println("Tudo bem...");
        }else ChamaData(true);
        System.out.println("Se quiser ver a linguagem do sistema, digite 2");
        int continuar2 = Integer.parseInt(teclado.nextLine());
        if (2 != continuar2) {
            System.out.println("Tudo bem...");
        }else ChamaLinguagem(true);
        System.out.println("Se quiser ver a resolução de sua tela, digite 3");
        int continuar3 = Integer.parseInt(teclado.nextLine());
        if (3 != continuar3) {
            System.out.println("Ok. Paramos por aqui então!");
        } else ChamaResolucao(true);
        System.out.println("Foi um prazer ter você aqui!");
        }

    }

