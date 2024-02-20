package ru.diana.shipandfish.main;

import ru.diana.shipandfish.entity.Fish;
import ru.diana.shipandfish.entity.FloatExecutor;
import ru.diana.shipandfish.entity.Ship;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Ship ship = new Ship();

        FloatExecutor floatExecutor = new FloatExecutor();

        floatExecutor.makeFloat(fish);
        floatExecutor.makeFloat(ship);
    }
}
