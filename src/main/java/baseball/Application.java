package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println(NumberGenerator.getRandomNumberNotRepeat());
        System.out.println(UserInputNumber.userInputNumber());
        System.out.println(Hint.hint());

    }
}
