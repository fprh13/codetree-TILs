import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 한번의 길이

        System.out.println(n * n);

        if (n < 5) {
            System.out.print("tiny");
        }

    }
}