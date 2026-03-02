package player;

import java.awt.event.WindowListener;
import java.util.Scanner;

public class PlayerController {

    static PlayerStats playerStats = new PlayerStats();
    static boolean isPlaying = true;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        playerStats.randomizePlayerStats();
        WelcomePlayer wlcPlayer = new WelcomePlayer();
        wlcPlayer.NewPlayer();
        String playerName = wlcPlayer.playerName();
        wlcPlayer.introduction();
        do {
            nextInput();
        }while(isPlaying);
    }
    public static void nextInput(){
        PlayerActions playerActions = new PlayerActions();
        String input = sc.nextLine();
        playerActions.playerDo(input);
    }
}
