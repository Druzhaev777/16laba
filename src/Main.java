
import java.util.Scanner;
class Formula1 {
    int a;
    int b;
    int c;

    Formula1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void displayFormula1() {
        double vector = a * Math.pow(b, c);
        System.out.println(vector);
    }
}
class Formula2 {
    int a;
    int b;
    int c;

    Formula2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void displayFormula() {
        double vector = a * Math.pow(b, c);
        System.out.println(vector);
    }
}
@FunctionalInterface
interface Converter <Formula1,Formula2> {
    Formula2 conv(Formula1 t);

}
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите цифру:");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        Formula1 first = new Formula1(a,b,c);
        Converter bb = x -> new Formula2(first.a, first.b, first.c);
        Formula2 second = (Formula2) bb.conv(first);
        second.displayFormula();
    }
}
