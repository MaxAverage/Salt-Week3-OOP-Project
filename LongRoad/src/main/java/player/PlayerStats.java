package player;

import java.util.Random;


public class PlayerStats {

    public void setFood(double food) {
        this.food = food;
    }

    public void setThirst(double thirst) {
        this.thirst = thirst;
    }

    public void setTired(double tired) {
        this.tired = tired;
    }

    private double food;
    private double thirst;
    private double tired;

    public void randomizePlayerStats() {
        Random rand = new Random();
        food = rand.nextDouble(0.7, 1);
        thirst = rand.nextDouble(0.8, 1);
        tired = rand.nextDouble(0.5, 1);
    }

    public void getStats(){
        String stats = "";
        stats += "Food: " + food + "\n"
                + "Thirst: " + thirst + "\n"
                + "Tired: " + tired + "\n";
        System.out.println(stats);
    }
}
