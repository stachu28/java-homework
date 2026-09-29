package Task4;

public class SumOfDigitsIteration {
    static void main(String[] args) {
        System.out.println(sumOfDigitsIter(12345));
        System.out.println(sumOfDigitsIter(23));
        System.out.println(sumOfDigitsIter(73));
        System.out.println(sumOfDigitsIter(10));

    }
    static int sumOfDigitsIter(int n){
        int sum = 0;
       while (n > 0) {
           sum += n % 10;
           n = n / 10;
       }
       return sum;
    }
}
