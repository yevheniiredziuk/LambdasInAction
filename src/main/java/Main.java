import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    static final int ASTERISK_COUNT = 50;
    public static void main(String[] args) {

        System.out.println("test MathOperation:");
        MathOperation math = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int a = 10, b = 20;
        System.out.printf("%d + %d = %d\n", a,b, math.operate(10, 20));
        System.out.println("*".repeat(ASTERISK_COUNT));

        System.out.println("test StringManipulator:");
        StringManipulator upper = s -> s.toUpperCase();
        String test = "test";
        System.out.printf("'%s' in upper case = '%s'\n", test, upper.operate(test));
        System.out.println("*".repeat(ASTERISK_COUNT));

        System.out.println("test StringListProcessor via Function<String, Integer>");
        Function<String, Integer> function = StringListProcessor::countUppercase;
        String text = "Hello WORLD! How ARE You TODAY?";

        System.out.printf("there are %d letters in upper case in '%s'\n",
                function.apply(text), text);
        System.out.println("*".repeat(ASTERISK_COUNT));

        System.out.println("test Supplier<T> via RandomNumberGenerator");
        Supplier<Integer> integerSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.printf("random number in range 1...100 is %d\n", integerSupplier.get());
    }
}
