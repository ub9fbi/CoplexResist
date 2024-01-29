import java.util.Scanner;

public class Rectangle extends Figur{
    private int x,y,length,width;
    @Override
    public boolean breedExist(int newX, int newY) {
        return x >= this.x && x <= (this.x + width) && y >= this.y && y <= (this.y + length);
    }

    @Override
    public double square() {
        return length * width;
    }

    @Override
    public void inputNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату, x");
        x = scanner.nextInt();
        System.out.println("Введите координату, y");
        y = scanner.nextInt();

    }
}
