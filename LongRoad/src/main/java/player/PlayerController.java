package player;

import java.awt.event.WindowListener;

public class PlayerController {
    public static void main(String[] args) {
        PlayerStats playerStats = new PlayerStats();
        playerStats.randomizePlayerStats();
        WelcomePlayer wlcPlayer = new WelcomePlayer();
        wlcPlayer.NewPlayer();
        String playerName = wlcPlayer.playerName();

        playerStats.getStats();
    }
}
