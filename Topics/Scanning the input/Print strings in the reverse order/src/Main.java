import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String java =  scanner.next();
        String programming = scanner.next();
        String language = scanner.next();

        System.out.println(language + "\n" + programming + "\n" + java);
    }
}