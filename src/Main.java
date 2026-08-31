
import java.util.Scanner;

public class Main {

    static final int MAX_HEALTH = 100;
    static final int STARTING_GOLD = 20;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String title = """
                 ===========================
                 ARENA OF DOOM AND DESPAIR
                 =========================
                """;
        System.out.print(title);

        System.out.println("you lemon sucker");
        System.out.println("you're life is at stake");
        System.out.println("you bum");
        System.out.println("");

        System.out.print("what is your name you suckler: ");
        String playerName = in.nextLine().trim();

        System.out.print("Difficulty (1 = baby mode, 2 = average, 3 = morale destroying): ");

        int difficulty = in.nextInt();
        in.nextLine(); // consume the leftover newline. Delete this line and
                       // the "Press Enter" prompt below flies straight past.

        //
        String difficultyName = switch (difficulty) {
            case 1 -> "baby mode";
            default -> "average";
            case 3 -> "morale destroying";

        };

        int health = MAX_HEALTH;
        int gold = STARTING_GOLD;
        int level = 1;
        boolean alive = true;
        double critChance = 0.15;

        String enemyName = "lil baby man";
        int enemyHealth = 40;
        int enemyPower = 7;

        System.out.printf("%-12s HP %3d/%3d Gold%4d Lv %d%n",
                playerName, health, MAX_HEALTH, gold, level);
        System.out.printf("Alive %-5b Crit %.0f%% %n", alive, critChance);
        System.out.println();

        // TODO 3c: a summary line, then wait for the player to press Enter:
        //
        System.out.printf("%s enters the arena. The %s has %d HP.%n",
                playerName, enemyName, enemyHealth);
        System.out.print("Press Enter to begin...");
        in.nextLine();

        System.out.println("poor soul: " + enemyName);
        System.out.println(enemyName.toUpperCase());
        System.out.println(enemyName.length());
        System.out.println(enemyName.contains("king baby man"));
        System.out.println(enemyName.equalsIgnoreCase("lil baby man"));

        System.out.println("health: " + enemyHealth);
        System.out.println("damage to your self esteem: " + enemyPower);
        System.out.println("");

        int damage = enemyPower * 2;
        health -= damage;
        System.out.println("You took " + damage + " damage. Health is now: " + health + "/" + MAX_HEALTH
                + "   This is the happiest I've ever been.");

        int potion = 15;
        health += potion;
        level++;
        System.out.println("You drank a potion. Health is apparently : " + health + "/" + MAX_HEALTH + " now.  Yay.");
        System.out.println("You reached level " + level + ".");
        System.out.println("");

        int hits = 3;
        int swings = 7;
        int brokenAccuracy = hits / swings * 100;
        System.out.println("Accuracy (broken): " + brokenAccuracy + "%");

        double acc1 = (double) hits / swings * 100;
        double acc2 = hits * 100.0 / swings;

        System.out.printf("Accuracy (cast)      %.1f%%%n", acc1);
        System.out.printf("Accuracy (reorder):     %.1f%%%n", acc2);
        System.out.println("");

        int turn = 6;
        boolean enrages = (turn % 3 == 0);
        System.out.println("Turn " + turn + " — enrages: " + enrages);
        System.out.println("");

        double critDamage = damage * 1.75;
        int applied = (int) critDamage;
        System.out.println("Crit damage (double): " + critDamage);
        System.out.println("Crit damage (int):    " + applied);
        System.out.println("Lost to the cast:     " + (critDamage - applied));
        System.out.println("");

        int bars = health / 5;

        String bar = "#".repeat(bars) + "-".repeat(20 - bars);
        System.out.printf("[%s] %d%%%n", bar, health);

        // ASK for the player's favorite color
        // IF the type is blank
        // USE "cri muh son" instead
        // SET enemy health based on answer
        // SHOW a summary and wait for enter

        System.out.print("[A]ttack  [D]efend  [P]otion  [F]lee: ");
        String action = in.nextLine().trim().toUpperCase();

        switch (action) {
            case "A" -> System.out.println("You attack. Slowly but surely.");
            case "D" -> System.out.println(" You defended you and your party. How noble. ");
            case "P" -> System.out.println("You started.. praying? Yes, BE A BELIEVER!");
            case "F" -> System.out.println("Yes, Run. That is the most sensible action.");
        }

        int roll = 7; // hard-coded on purpose; L12 makes it random
        int damage2;
        int potions = 2;

        System.out.printf("You have %d %s left.%n", potions,
                potions == 1 ? "potion" : "potions");

        String condition = health > MAX_HEALTH / 2 ? "healthy" : "barely holding on";

        if (roll >= 9) {
            damage2 = enemyPower * 2;
            System.out.println("That was a critical hit. You're pretty locked in");
        } else if (roll >= 3) {
            damage2 = enemyPower;
            System.out.println("You hit him, completely normal.");
        } else {
            damage2 = 0;
            System.out.println("lol you suck");
        }

        if (enemyHealth <= 0) {
            System.out.println("the poor " + enemyName + " dies, you monster!");
            alive = true;
        } else if (health <= 0) {
            System.out.println("You died! Yay!");
            alive = false;
        }
        if (swings > 0 && hits / swings > 0.5) {
            System.out.println("Your aim is solid.");
        }

        if (health < MAX_HEALTH / 4 && gold >= 10) {
            System.out.println("You should buy a potion, you look like a shriveled up raisin.");
        }

        if (!alive || enemyHealth <= 0) {
            System.out.println("The fight is over. You won, you monster.");
        }
        if (health > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else if (health < 0) {
            health = 0;
        }
    }
}