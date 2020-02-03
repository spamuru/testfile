package LeetCode;

import java.util.List;
import java.util.Random;

public class RandomGenerator {

    public static void main(String[] args) {

        for (int j = 0; j <= 100; j++) {
            int num = new Random().nextInt(4);
            System.out.println(num);
        }

    }
}
