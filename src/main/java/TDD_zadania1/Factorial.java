package TDD_zadania1;

public class Factorial {


    public static long getFactorialOf(int elementIndex) {
        if(elementIndex<0){
            throw new RuntimeException("OnlyPositiveNumbersAreValid");
        }
        if ((elementIndex==0)||(elementIndex==1)){
            return 1;
        }
        return getFactorialOf(elementIndex-1)*elementIndex;
    }
}
