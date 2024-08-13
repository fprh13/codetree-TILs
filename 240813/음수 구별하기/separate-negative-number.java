import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(a);

        // 음수 일 경우
        if (a < 0) {
            System.out.print("minus");
        }
    }
}