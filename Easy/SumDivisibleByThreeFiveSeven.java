
public class SumDivisibleByThreeFiveSeven {
    public static int sumDivisibleByThreeFiveSeven(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 100;
        int sum = sumDivisibleByThreeFiveSeven(n);
        System.out.println("Summe von Nummern die entweder durch 3 5 oder 7 teilbar sind im Bereich von [1, " + n + "]: " + sum);
    }
}