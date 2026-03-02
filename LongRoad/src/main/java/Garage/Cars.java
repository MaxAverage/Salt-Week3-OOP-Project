package Garage;

import java.util.Random;

public class Cars {
    private static enum carBrands{
        BMW, Toyota, Subaru, Volvo, Mercedes, Ford, Opel
    }

    public String getRandomCar(){
        return carBrands.values()[new Random().nextInt(carBrands.values().length)].toString();
    }
}
