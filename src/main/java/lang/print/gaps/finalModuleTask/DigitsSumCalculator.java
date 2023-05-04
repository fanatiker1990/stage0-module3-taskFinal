package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int remainder=number%10;
        int remainderDividedBy_1000=number/1000;
        number%=1000;
        int remainderDividedBy_100=number/100;
        number%=100;
        int remainderDividedBy_10=number/10;
        System.out.println(remainderDividedBy_1000+remainderDividedBy_100+remainderDividedBy_10+remainder);
    }

}
