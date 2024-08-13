import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double visionAverage = sc.nextDouble();

        if (visionAverage >= 1.0) {
            System.out.print("High");
        } else if (visionAverage >= 0.5) {
            System.out.print("Middle");
        } else {
            System.out.print("Low");
        }

    }
}