package codewars;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Coins {

    public static int solve(int amount, int[] coinAmounts) {
        Arrays.sort(coinAmounts);
        int counter = 0;
        for (int i = coinAmounts.length - 1; i >= 0; i--) {
            int coin = coinAmounts[i];
            int d = amount / coin;
            if (d == 0) {
                continue;
            }
            if (amount % coin == 0) {
                counter += d;
                return counter;
            } else {
                amount = amount - coin * d;
                counter += d;
            }
        }
        return counter;
    }

    public static int solve2(int amount, int[] coinAmounts) {
        int coins = 0;
        Arrays.sort(coinAmounts);
        for (int i = coinAmounts.length - 1; i >= 0; i--) {
            coins += amount / coinAmounts[i];
            amount %= coinAmounts[i];
            System.out.println(coins + " " + amount);
        }
        return coins;
    }

    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        if (upSpeed > desiredHeight) {
            return 1;
        }
        double dailySpeed = upSpeed - downSpeed;
        return (int) Math.ceil((desiredHeight - upSpeed) / dailySpeed) + 1;
    }

    public static boolean CheckIfFlush2(String[] cards) {
        char first = cards[0].charAt(cards[0].length() - 1);
        return Arrays.stream(cards).allMatch(c -> c.endsWith(String.valueOf(first)));
    }

    public static boolean CheckIfFlush(String[] cards) {
        System.out.println(java.util.Arrays.toString(cards).replaceAll("[^HCSD]", ""));
        return java.util.Arrays.toString(cards).replaceAll("[^HCSD]", "").matches("(.)\\1{4}");
    }

    private static Map<String, Integer> values = Stream.of(new Object[][]{
            {"spock", 1},
            {"scissors", 2},
            {"paper", 3},
            {"rock", 4},
            {"lizard", 5}
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

    public static String rpsls(String player1, String player2) {
        if (player1.equals(player2)) {
            return "Draw!";
        }
        int val1 = values.get(player1);
        int val2 = values.get(player2);
        if (((val1 - val2) > 0 && (val1 - val2) % 2 == 0) || ((val1 - val2) < 0 && (val1 - val2) % 2 == -1)) {
            return "Player 1 Won!";
        }
        return "Player 2 Won!";
    }

    public static void main(String[] args) {
//        int[] coins1 = {1, 5, 10, 25};
//        System.out.println(solve2(123, coins1));

//        System.out.println(growingPlant(100, 10, 910)); //10
//        System.out.println(growingPlant( 10,  9,   4)); //1

//        System.out.println(CheckIfFlush(new String[]{"AS", "3S", "9S", "KS", "4S"}));
//        System.out.println(CheckIfFlush(new String[]{"AD", "4S", "7H", "KC", "5S"})); // false
//        System.out.println(CheckIfFlush(new String[]{"AD", "4S", "10H", "KC", "5S"})); // false
//        System.out.println(CheckIfFlush(new String[]{"QD", "4D", "10D", "KD", "5D"}));


        assertEquals("Player 1 Won!", rpsls("rock", "lizard"));
        assertEquals("Player 1 Won!", rpsls("paper", "rock"));
        assertEquals("Player 1 Won!", rpsls("scissors", "lizard"));
        assertEquals("Player 1 Won!", rpsls("lizard", "paper"));
        assertEquals("Player 1 Won!", rpsls("spock", "rock"));

        assertEquals("Player 2 Won!", rpsls("lizard", "scissors"));
        assertEquals("Player 2 Won!", rpsls("spock", "lizard"));
        assertEquals("Player 2 Won!", rpsls("paper", "lizard"));
        assertEquals("Player 2 Won!", rpsls("scissors", "spock"));
        assertEquals("Player 2 Won!", rpsls("rock", "spock"));

        assertEquals("Draw!", rpsls("rock", "rock"));
        assertEquals("Draw!", rpsls("spock", "spock"));

    }

    public static boolean assertEquals(String str1, String str2) {
        boolean result = str1.equals(str2);
        System.out.println(result);
        return result;
    }
}
