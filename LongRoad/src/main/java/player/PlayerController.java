package player;

import java.awt.event.WindowListener;

public class PlayerController {

    static PlayerStats playerStats = new PlayerStats();
    static boolean isPlaying = true;

    public static void main(String[] args) {

        playerStats.randomizePlayerStats();
        WelcomePlayer wlcPlayer = new WelcomePlayer();
        wlcPlayer.NewPlayer();
        String playerName = wlcPlayer.playerName();

        do {
            nextInput();
        }while(isPlaying);
    }
    public static void nextInput(){
        playerStats.getStats();
        isPlaying = false;
    }
}
