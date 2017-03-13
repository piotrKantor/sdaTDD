package AlreadyKnown;

public class Adder {

    private double first;
    private double second;

    public Adder(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public static int addIntNumbers(int fisrst, int second){
        return fisrst+second;
    }

    public double getSumOfDoubles(){
        return first+second;
    }

    @Override
    public String toString() {
        return "Adder{" +
                "first=" + first +
                '}';
    }
}
