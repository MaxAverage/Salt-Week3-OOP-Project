package player;

import Extras.Sleep;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class WelcomePlayer {

    Scanner sc = new Scanner(System.in);
    Sleep sleep = new Sleep();

    public void NewPlayer() {
        System.out.println("------------------------");
        System.out.println("Welcome to the Long Road");
        System.out.println("------------------------");
    }

    public String playerName(){
        System.out.println("Enter your name: ");
        return sc.nextLine();
    }
    public void introduction(){
        System.out.println("------------------------");
        System.out.println("Use 'help' for commands");
        System.out.println("------------------------");
        sleep.sleepForSeconds(1);
        System.out.println("You wake up in a garage");
        sleep.sleepForSeconds(1);
        System.out.println("Dazed, you try to remember");
        sleep.sleepForSeconds(2);
        System.out.println("You need to fix this car \uD83D\uDE97 and drive home");
    }
}
