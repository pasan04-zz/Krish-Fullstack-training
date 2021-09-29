import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class BigDecima1 {
    public static void main(String[] args) {
        bigDecimal();
    }

    public static void bigDecimal(){

        //two new Big Decimals
        BigDecimal b1 = new BigDecimal("56789123.567892132");
        BigDecimal b2 = new BigDecimal("12342323.123422323");


        //add two decimals
        BigDecimal addTwoDecimal = b1.add(b2);
        System.out.println("Add two decimal " + addTwoDecimal);

        //substract two decimals
        BigDecimal substractTwoDecimal = b1.add(b2);
        System.out.println("Substract two decimal " + substractTwoDecimal);

        //multiply two decimals
        BigDecimal multiplyTwoDecimal = b1.multiply(b2);
        System.out.println("Multiply two decimal " + multiplyTwoDecimal);

        //divide two decimals
        //When a MathContext object is supplied with a precision setting of 0 (for example, MathContext.UNLIMITED),
        // arithmetic operations are exact, as are the arithmetic methods which take no MathContext object.
        BigDecimal divideTwoDecimal = b1.divide(b2, 2, RoundingMode.HALF_UP);
        System.out.println("Divide two decimal " + divideTwoDecimal);

        // BigDecima1 raised to the power of 2
        BigDecimal rasideTothePowerDecimalTwo = b1.pow(6);
        System.out.println("Raise to the power of 2 = " + rasideTothePowerDecimalTwo);

        // Negative value of BigDecimal1
        BigDecimal negativeValue= b1.negate();
        System.out.println("Negative value = " + negativeValue);

        List<BigDecimal> myList = new ArrayList<>();

        myList.add(BigDecimal.valueOf(56789123.567892132));
        myList.add(BigDecimal.valueOf(12342323.123422323));

        System.out.println(myList);


    }
}

