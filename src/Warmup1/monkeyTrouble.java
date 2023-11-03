package Warmup1;

public class monkeyTrouble {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

    public boolean monkeyTroubleSolution2(boolean aSmile, boolean bSmile) {
        if ((aSmile == true && bSmile == true)||(aSmile==false && bSmile==false)){
            return true;
        } else {
            return false;
        }
    }
}
