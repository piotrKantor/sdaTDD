package ExceptionExample;

public class Divider {

    private Integer numerator;
    private Integer denominator;

    public Divider(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Double divideNumbers(){
        return Double.valueOf(numerator/denominator);
    }
}
