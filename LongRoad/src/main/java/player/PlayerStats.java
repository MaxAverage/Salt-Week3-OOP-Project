package player;

import java.util.Random;


public class PlayerStats {

    public void setFood(double food) {
        PlayerStats.food = food;
    }

    public void setThirst(double thirst) {
        PlayerStats.thirst = thirst;
    }

    public void setTired(double tired) {
        PlayerStats.tired = tired;
    }

    public static double getFood() {
        return food;
    }

    public static double getThirst() {
        return thirst;
    }

    public static double getTired() {
        return tired;
    }

    private static double food;
    private static double thirst;
    private static double tired;

    public void randomizePlayerStats() {
        Random rand = new Random();
        food = rand.nextDouble(0.6, 1);
        thirst = rand.nextDouble(0.8, 1);
        tired = rand.nextDouble(0.5, 1);
    }

    public void getStats(){
        System.out.printf("Food: %.0f%% \n Thirst: %.0f%% \n Tired: %.0f%% \n", food * 100, thirst * 100, tired * 100);
    }
}
