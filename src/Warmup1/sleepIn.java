package Warmup1;

public class sleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday != true || vacation == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sleepInSolution2(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
}
