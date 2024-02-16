import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Figur> figurList = new ArrayList<Figur>();
    public static void main(String[] args)
    {
        Circl circl = new Circl();
        Rectangle rectangle = new Rectangle();

        int k = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите фигуру; 1 - круг, 2 - прямоугольник");
        if (k == 1) {
            circl.inputNumbers();
            System.out.println("Площадь круга");
        } else if (k == 2) {
            rectangle.inputNumbers();
            System.out.println("Площадь прямоугольника");
        }


    }
}
