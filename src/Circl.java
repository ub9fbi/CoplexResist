import java.util.Scanner;

public class Circl extends Figur{

    private int x, y, R;

    @Override
    public boolean breedExist(int x, int y) {
        double L = Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
        return L <= R;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(R,2);
    }

    @Override
    public void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату, x");
        x = scanner.nextInt();
        System.out.println("Введите координату, y");
        y = scanner.nextInt();
        System.out.println("Введите радиус, r");
        R = scanner.nextInt();
    }
}
