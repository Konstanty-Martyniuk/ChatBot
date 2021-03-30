import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> guestsArray = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String guests = scanner.nextLine();
            var tempArray = guests.split(" ");
            for (String j: tempArray) {
                guestsArray.add(j);
            }
        }
        Collections.reverse(guestsArray);
        for (String name: guestsArray) {
            System.out.println(name);
        }
    }
}