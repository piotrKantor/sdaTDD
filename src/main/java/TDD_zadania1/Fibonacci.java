package TDD_zadania1;

public class Fibonacci {


    public static long getElementOfIndex(int index) {

        if(index<0){
            throw new RuntimeException("OnlyPositiveNumbersAreValid");
        }else if(index<=1){
            return index;
        }else{
            return getElementOfIndex(index-1) + getElementOfIndex(index-2);
        }

    }
}
