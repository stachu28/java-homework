package Task4;

public class SumOfDigitsIteration {
    static void main(String[] args) {
        System.out.println(sumaCyfrIter(12345));
        System.out.println(sumaCyfrIter(23));
        System.out.println(sumaCyfrIter(73));
        System.out.println(sumaCyfrIter(10));

    }
    static int sumaCyfrIter(int n){
        int sum = 0;
       while (n > 0) {
           sum += n % 10;
           n = n / 10;
       }
       return sum;
    }
}
