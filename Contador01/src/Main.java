//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int c = 0;
        while (c < 10) {
            c++;
            if (2 > c) {
                continue;
            }
            if (c > 7) {
                break;
            }
            System.out.println(c);
        }
    }
}