import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max){
        Random random = new Random();
        return random.nextInt(min, max+1);
    }
}
