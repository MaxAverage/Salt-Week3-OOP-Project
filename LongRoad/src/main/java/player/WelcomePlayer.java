package player;

import java.util.Scanner;

public class WelcomePlayer {

    Scanner sc = new Scanner(System.in);

    public void NewPlayer() {
        System.out.println("------------------------");
        System.out.println("Welcome to the Long Road");
        System.out.println("------------------------");
    }

    public String playerName(){
        System.out.println("Enter your name: ");
        return sc.nextLine();
    }

}
