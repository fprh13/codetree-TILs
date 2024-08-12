public class Main {
    public static void main(String[] args) {
        double oneFitToCM = 30.48;
        double oneMileToCM = 160934;

        double requestFirstFit = 9.2;
        double requsetSecondMile = 1.3; 
        System.out.printf("%.1fft = %.1fcm\n",requestFirstFit, requestFirstFit * oneFitToCM);
        System.out.printf("%.1fmi = %.1fcm",requsetSecondMile, requsetSecondMile * oneMileToCM);
    }
}