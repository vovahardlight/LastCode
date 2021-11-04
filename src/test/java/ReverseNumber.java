import java.util.ArrayList;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 100;
        int hundred[];
        hundred = new int[101];

        int reverse[];
        reverse = new int[101];

        for (int i = 0; i <= 100; i++) {
            hundred[i] = number--;
        }
        for (int i = 0; i < hundred.length; i++) {
            reverse[i] = i;
        }
        for (int i = 0; i < reverse.length; i++) {
            if (i % 10 == 0 && i >0) {
                continue;
            } else {
                System.out.println(reverse[i]);
            }
        }
    }
}
