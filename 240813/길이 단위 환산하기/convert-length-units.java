import java.util.*;

public class Main {
    public static void main(String[] args) {
        double oneFitToCM= 30.48;
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.printf("%.1f", a * oneFitToCM);
    }
}