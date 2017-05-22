import java.util.Scanner;

public class App {
    public static void main (String[] args){
        System.out.println("Witaj swiecie");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Aby zamknac aplikacje, wpisz \"exit\" i nacisnij Enter");
            if (scanner.next().equals("exit"))
                break;
        }
    }
}
