import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        double average = ((double)(a + b)) / 2;

        System.out.printf("%d %.1f", sum, average);


    }
}