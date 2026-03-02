package player;

import Extras.Sleep;

public class PlayerActions {

    static PlayerStats pStats = new PlayerStats();
    static Sleep sleep = new Sleep();

    public void playerDo(String input) {
        switch (input) {
            case "help":
                helpCommands();
                break;
            case "nearby":
                lookNearby();
                break;
            case "stats" :
                stats();
                break;
            case "sleep":
                sleep();
                break;
            case "drive":
                drive();
                break;
            case "explore":
                explore();
                break;
            case "quit" :
                quit();
                break;
                default:
                    System.out.println("Invalid input");
        }
    }
    private static void helpCommands(){
        System.out.println("---------commands--------");
        System.out.println("stats: Check your stats \n nearby: Check what is nearby ");
        sleep.sleepForSeconds(1);
        System.out.println("\n sleep: sleeps until fully rested \n drive: Drive for an hour ");
        sleep.sleepForSeconds(1);
        System.out.println("\n explore: Look for supplies \n attack: Use primary weapon to attack");
        sleep.sleepForSeconds(1);
        System.out.println("\n quit: Quit application \n ---------commands--------");
    }
    private static void lookNearby() {

    }
    private static void sleep() {

    }
    private static void stats() {
        pStats.getStats();
    }
    private static void drive() {

    }
    private static void explore() {

    }
    private static void quit() {
        PlayerController.isPlaying = false;
    }
}
