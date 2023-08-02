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
    public static boolean isSimple(int number) {
        if(number < 2) return false;
        for(int i = 2; i < number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
