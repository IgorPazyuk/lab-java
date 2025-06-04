import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рядок з дужками: ");
        String input = scanner.nextLine();

        int balance = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(') {
                balance++;
            } else if (ch == ')') {
                balance--;
                if (balance < 0) {
                    System.out.println(i);
                    return;
                }
            }
        }

        if (balance == 0) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}
