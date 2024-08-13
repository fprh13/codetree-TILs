import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        String level = score < 100 ? "1~9등급" : "0등급";

        System.out.print(level.equals("0등급") ? "pass":"failure");
    }
}