import java.util.Arrays;
import java.util.Random;

public class RandomFillProject {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        short listLength = 100;
        short numberOfRandomNumbers = 5;
        int[] someList =  new int[listLength];

        for (int i = numberOfRandomNumbers; i > 0; i--) {
            int aRandomNumber = randomNumberGenerator.nextInt(1024);
            someList[randomNumberGenerator.nextInt(someList.length)] = aRandomNumber;
        }

        for (int i: someList)
            System.out.printf("%d ", i);

        Arrays.fill(someList, 1);
        for (int i: someList)
            System.out.printf("%d ", i);
    }
}
