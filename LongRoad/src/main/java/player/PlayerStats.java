package player;

import java.util.Random;


public class PlayerStats {
    public double getFood() {
        return food;
    }

    public double getTired() {
        return tired;
    }

    public double getThirst() {
        return thirst;
    }

    private double food;
    private double thirst;
    private double tired;

    public void randomizePlayerStats() {
        Random rand = new Random();
        food = rand.nextDouble(0.7, 1);
        thirst = Math.random();
        tired = Math.nextDown(0.7);
    }

    public void getStats(){
        String stats = "";
        stats += "Food: " + food + "\n"
                + "Thirst: " + thirst + "\n"
                + "Tired: " + tired + "\n";
        System.out.println(stats);
    }
}
