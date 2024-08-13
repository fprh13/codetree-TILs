import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int sum = a + b + c;
        int average = (a + b + c) / 3;

        System.out.println(sum);
        System.out.println(average);
        System.out.print(sum - average);
    }
}