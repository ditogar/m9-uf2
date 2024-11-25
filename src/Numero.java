import java.util.Random;

public class Numero {
    public static void main(String[] args) {
            Random random = new Random();
            int num = random.nextInt(1, 100);
            System.out.println(num);
    }
}
