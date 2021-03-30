import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(word.substring(number1, number2 + 1));
    }
}