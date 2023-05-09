package codewars;

public class Puzzles {

    public static boolean consecutiveDucks(int n) {
        if (n < 2) {
            return false;
        }
        if (n % 2 == 1) {
            return true;
        } else {
            return consecutiveDucks(n / 2);
        }
    }

    public static int friends(int n) {
        if (n <= 2) return 0;
        if (n == 3) return 1;
        else return friends((n+1)/2) + 1;
    }

    public static int friends2(int n) {
        int max = 2;
        int friends = 0;
        while (n > max) {
            friends++;
            max *= 2;
        }
        return friends;
    }

    public static void main(String[] args) {
        System.out.println(friends2(4));
        System.out.println(friends2(7));

/*        System.out.println(10 + ", " + consecutiveDucks(10)); // true
        System.out.println(69 + ", " + consecutiveDucks(69)); // true
        System.out.println(8 + ", " + consecutiveDucks(8)); // false
        System.out.println(57 + ", " + consecutiveDucks(57));// true
        System.out.println(6 + ", " + consecutiveDucks(6)); //true
        System.out.println(13 + ", " + consecutiveDucks(13)); // true
        System.out.println(16 + ", " + consecutiveDucks(16)); //false
        System.out.println(91 + ", " + consecutiveDucks(91)); //true*/
    }
}
