/*
 * U1 L4 — THE STATUS LINE · STARTER CODE
 * 7184 Software Development · Unit 1, Lesson 4
 *
 * ALREADY HERE:  Lessons 1–3 finished — stat block, combat arithmetic, the
 *                accuracy fixes, the enrage timer, the crit cast.
 * YOU'RE ADDING: printf, String methods, a health bar, and a title screen.
 *
 *     javac Main.java
 *     java Main
 *
 * Today is the day the output stops looking terrible. Everything you have been
 * told to ignore for three lessons — the crooked columns, the 42.857142857142854 —
 * gets fixed with printf.
 */



import java.util.Scanner;

public class Main {



    static final int MAX_HEALTH = 100;
    static final int STARTING_GOLD = 20;


    public static void main(String[] args) {
/*
         * TODO 1: PSEUDOCODE — the design, in English, before any Java.
         *
         *   Write out what the program will ASK for and what it will DO with
         *   each answer. Use plain words in capitals for the decisions:
         *   ASK, IF, SET, SHOW, REPEAT UNTIL.
         *
         *   Mine looks like this — yours should match YOUR game:
         *
         *       ASK for the player's name
         *       IF the name is blank
         *           USE "Challenger" instead
         *       ASK for difficulty 1-3
         *       SET enemy health based on difficulty
         *       SHOW a summary and wait for Enter
         *
         *   Leave it here as a comment when you're done. It is part of what
         *   you turn in, and in six weeks it is how you'll remember what this
         *   file was supposed to do.
         * 
         *  ASK for the player's name
            IF the name is blank
            USE "zawgalicious" instead
            ASK for difficulty 1-3
            SET enemy health based on difficulty
            SHOW a summary and wait for enter
         */

  

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

 
        
                     System.out.print("What is your name, challenger? ");
                     String playerName = in.nextLine().trim();
        


        // TODO 3b: ask for a difficulty from 1 to 3 with in.nextInt(), then
        //          use it to scale the enemy — enemyHealth and enemyPower
        //          below should be worked out FROM difficulty, not fixed.
        //
        //          THE BUG EVERYONE HITS: nextInt() takes the number and
        //          leaves the Enter keypress sitting in the buffer. The next
        //          nextLine() then reads that leftover newline and returns
        //          immediately. Fix it with one bare line right after:
        //
                 int difficulty = in.nextInt();
                in.nextLine();  
        //
        //          Write that comment on it. You will meet this bug again.




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
        System.out.println("You took " + damage + " damage. Health is now: " + health + "/" + MAX_HEALTH + "   This is the happiest I've ever been.");


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


 // TODO 4: break it on purpose, twice. Read each error, then undo it.
        //
        //     a) Delete your  in.nextLine();  after nextInt(). Run it. The
        //        "Press Enter" prompt flies straight past. NO error message —
        //        the program just skips a question. That is the worst kind of
        //        bug and the reason the fix line gets a comment.

        //
        //     b) At the difficulty prompt, type a LETTER instead of a number.
        //        InputMismatchException, and the program dies. Real validation
        //        needs hasNextInt() and a loop — that is Lesson 8. Today you
        //        just need to have SEEN it.


        // TODO 5: design a feature of your own. Pseudocode FIRST, as a comment,
        //         then build it. Ask the player something your game cares about
        //         — a class, a weapon, a starting bonus — and use the answer.


        //  ASK for the player's type in women
        //    IF the type is blank
        //    USE "men" instead
        //    SET enemy health based on difficulty
        //    SHOW a summary and wait for enter
    }
}