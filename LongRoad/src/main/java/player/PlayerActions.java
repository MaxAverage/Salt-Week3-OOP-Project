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
        sleep.sleepForSeconds(2);
        System.out.println("\n sleep: sleeps until fully rested \n drive: Drive for an hour ");
        sleep.sleepForSeconds(2);
        System.out.println("\n explore: Look for supplies \n attack: Use primary weapon to attack");
        sleep.sleepForSeconds(2);
        System.out.println("\n quit: Quit application \n ---------commands--------");
    }
    private static void lookNearby() {
        System.out.println("The garage is full of junk: [items] and the rusty car");
    }
    private static void sleep() {
        if(pStats.getTired() > 0.9){
            System.out.println("You are not tired enough to sleep");
            return;
        }
        System.out.println("The slumber sets in");
        sleep.sleepTilFull();
        pStats.setTired(1);
    }
    private static void stats() {
        pStats.getStats();
    }
    private static void drive() {
        System.out.println("You cannot drive that rusty piece of shit");
    }
    private static void explore() {
        System.out.println("Theres nothing to explore right now");
    }
    private static void quit() {
        PlayerController.isPlaying = false;
    }
}
