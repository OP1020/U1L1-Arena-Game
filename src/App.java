public class App {

static final int MAX_HEALTH = 100;
static final int STARTING_GOLD = 20;

    public static void main(String[] args) throws Exception{
        // Flavor text. What you write in 8 through 11 are your choice more or less
        System.out.println("you stupid lemon sucker");
        System.out.println("i hate your stupid face, you less than average bufoon");
        System.out.println("i hope you lose you bum of a person");

        
        String playerName = "zawgalicious";
        int health = MAX_HEALTH;
        int level = 1;
        int gold = STARTING_GOLD;
        boolean isAlive = true;
        double critChance = 0.15;

        String enemyName = "big dawg";
        int enemyHealth = 15;
        int enemyPower = 10;

        
        System.out.println("heartless monster: " + playerName);
        System.out.println("health: " + health + "/" + MAX_HEALTH);
        System.out.println("cash money: " + gold);
        System.out.println("experience: " + level);
        System.out.println("living: " + isAlive);
        System.out.println("critical? : " + critChance );


        System.out.println("poor soul: " + enemyName);
        System.out.println("Lifeforce: " + enemyHealth);
        System.out.println("fighting capability: " + enemyPower);
        System.out.println();







        int damage = enemyPower * 2;
        System.out.println("You took " + damage + "damage. Health is now: " + health);
    }
}
