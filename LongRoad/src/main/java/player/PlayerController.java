package player;

import Garage.Cars;

import java.awt.event.WindowListener;
import java.util.Scanner;

public class PlayerController {

    static PlayerStats playerStats = new PlayerStats();
    static PlayerActions playerActions = new PlayerActions();
    static boolean isPlaying = true;
    static Scanner sc = new Scanner(System.in);
    static Cars cars = new Cars();

    static String car;

    public static void main(String[] args) {
        playerStats.randomizePlayerStats();
        car = cars.getRandomCar();
        WelcomePlayer wlcPlayer = new WelcomePlayer();
        wlcPlayer.NewPlayer();
        String playerName = wlcPlayer.playerName();
        wlcPlayer.introduction(car);
        nextInput();
    }
    public static void nextInput(){
        while(isPlaying){
            String input = sc.nextLine();
            playerActions.playerDo(input);
        }
    }
}
