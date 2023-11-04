package Warmup1;

public class sumDouble {

    public int sumDouble(int a, int b) {
        int sum = a + b;

        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }

    public int sumDoubleSolution2(int a, int b) {
        if(a!=b){
            return a+b;
        } else {
            return 2*(a+b);
        }
    }
}
