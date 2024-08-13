import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(); // 신장
        int w = sc.nextInt(); // 체중

        int bmi = (10000 * w) / (h*h); // BMI

        boolean isObesity = bmi >= 25; // 비만 여부
        
        System.out.println(bmi);

        if (isObesity) {
            System.out.print("Obesity");
        }
    }
}