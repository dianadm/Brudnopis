package codewars;

public class Fighters {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter first;
        Fighter second;
        if (fighter1.name.equals(firstAttacker)) {
            first = fighter1;
            second = fighter2;
        } else {
            first = fighter2;
            second = fighter1;
        }

        while (first.health > 0 && second.health >0) {
            second.health = second.health - first.damagePerAttack;
            first.health = first.health - second.damagePerAttack;
        }
        return second.health <= 0 ? first.name : second.name;
    }

    public static void main(String[] args) {
        String name =  Fighters.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew");
        String name3 = Fighters.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry");
        String name4 =  Fighters.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry");
        String name5 = Fighters.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald");
        String name6 = Fighters.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry");
        String name7 =  Fighters.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald");
        System.out.println(name);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
        System.out.println(name6);
        System.out.println(name7);
    }
}

class Fighter {

    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}
