public class Main {
    public static void main(String[] args) {
        int ticket = 1000;

        int rubles = 20;

        int mile = 1;

        int BonusMile = ticket / rubles * mile;

        System.out.println("Бонус мили:" + BonusMile);
    }
}