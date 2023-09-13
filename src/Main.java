import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите реальное значение резистора: ");
        double R = scanner.nextDouble();
        System.out.print("Введите мнимую индуктивность: ");
        double L = scanner.nextDouble();
        System.out.print("Введите угловую частоту: ");
        double Hz = scanner.nextDouble();

        ComplexNumber complexNumber = new ComplexRezist(R,L,Hz);
        ((ComplexRezist) complexNumber).weModAndArg();
        ((ComplexRezist) complexNumber).weComplexResist();
    }
}
