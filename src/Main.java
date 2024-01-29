import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Figur> petList = new ArrayList<Figur>();
    public static void main(String[] args) {
        int k=0;
        Scanner sc = new Scanner(System.in);

        while (k<3) {
            System.out.println("Введите: 1 - создать кошку, 2 - создать собаку, 3-выйти");
            k = sc.nextInt();
            if (k==1){
                petList.add(new Circl());
            } else  if (k==2){
                petList.add(new Rectangle());
            }
        }
    }
}
