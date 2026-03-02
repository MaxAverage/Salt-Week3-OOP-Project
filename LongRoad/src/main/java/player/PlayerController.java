package player;

import java.awt.event.WindowListener;
import java.util.Scanner;

public class PlayerController {

    static PlayerStats playerStats = new PlayerStats();
    static PlayerActions playerActions = new PlayerActions();
    static boolean isPlaying = true;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        playerStats.randomizePlayerStats();
        WelcomePlayer wlcPlayer = new WelcomePlayer();
        wlcPlayer.NewPlayer();
        String playerName = wlcPlayer.playerName();
        wlcPlayer.introduction();
        nextInput();
    }
    public static void nextInput(){
        while(isPlaying){
            String input = sc.nextLine();
            playerActions.playerDo(input);
        }
    }
}
