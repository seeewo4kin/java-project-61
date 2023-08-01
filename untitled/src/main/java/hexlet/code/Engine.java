package hexlet.code;

import java.util.concurrent.ThreadLocalRandom;

public class Engine {

    public static int randValue(){
        int value = ThreadLocalRandom.current().nextInt(1, 99 + 1);
        return value;
    }
    public static int randValue20(){
        int value = ThreadLocalRandom.current().nextInt(1, 19+1);
        return value;
    }
    public static int randValue10(){
        int value = ThreadLocalRandom.current().nextInt(1, 9+1);
        return value;
    }
    public static int randCalcAct(){
        int value = ThreadLocalRandom.current().nextInt(1,2+1);
        return  value;
    }
}
