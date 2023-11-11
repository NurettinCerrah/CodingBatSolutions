package Warmup1;

public class in1020 {

//    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
//
//
//    in1020(12, 99) → true
//    in1020(21, 12) → true
//    in1020(8, 99) → false

    public boolean in1020(int a, int b) {

        if ((10<=a && a<=20) || (10<=b && b<=20)){
            return true;
        } else {
            return false;
        }
    }
}
