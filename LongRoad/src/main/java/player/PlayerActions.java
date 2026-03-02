package player;

public class PlayerActions {

    public void playerDo(String input) {
        switch (input) {
            case "help":
                helpCommands();
            case "nearby":
                lookNearby();
            case "sleep":
                sleep();
            case "drive":
                drive();
            case "explore":
                explore();
            case "quit" :
                quit();
        }
    }
    private static void helpCommands(){
        System.out.println("---------commands--------");
        System.out.println("stats: Check your stats \n nearby: Check what is nearby " +
                "\n sleep: sleeps until fully rested \n drive: Drive for an hour " +
                "\n explore: Look for supplies \n attack: Use primary weapon to attack " +
                "\n quit: Quit application");
        System.out.println("---------commands--------");

    }
    private static void lookNearby() {

    }
    private static void sleep() {

    }
    private static void drive() {

    }
    private static void explore() {

    }
    private static void quit() {
        PlayerController.isPlaying = false;
    }
}
