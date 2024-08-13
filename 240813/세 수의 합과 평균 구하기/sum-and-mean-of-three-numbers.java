import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int sum = a + b + c;
        double average = (double)(a+b+c) / 3;

        System.out.printf("%d\n%.0f",sum,average);
    }
}