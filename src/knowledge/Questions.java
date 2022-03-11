package knowledge;

public class Questions {

    public static void main(String[] args) {
        // kiedy zwroci niepoprawny wynik? // dla n = 4; czy cos jeszcze?

        int n = 8;
        boolean result = true;

        if (n < 1) {
            result = false;
        }
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                result = false;
            }
        }

        System.out.println(result);
    }
}
