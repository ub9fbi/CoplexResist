import java.util.Scanner;

public class Circl extends Figur{

    private int x, y, R;

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean breedExist(int newX, int newY) {
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
        setX(x);
        System.out.println("Введите координату, y");
        y = scanner.nextInt();
        setY(y);
        System.out.println("Введите радиус, r");
        R = scanner.nextInt();
        setR(R);
    }
}
