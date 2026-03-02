package player;

public class PlayerController {
    public static void main(String[] args) {
        PlayerStats playerStats = new PlayerStats();
        playerStats.randomizePlayerStats();
        playerStats.getStats();
    }
}
