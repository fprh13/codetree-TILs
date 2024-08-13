import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temperature = sc.nextInt();

        if (temperature >= 100) {
            System.out.print("vapor");
        } else if (0 =< temperature) {
            System.out.print("water");
        } else {
            System.out.print("ice");
        }
    }
}