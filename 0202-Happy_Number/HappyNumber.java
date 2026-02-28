
public class HappyNumber {

    public boolean isHappy(int n) {
        HashSet<Integer> s = new HashSet<>();
        while (n != 1 && !s.contains(n)) {
            s.add(n);
            n = sumofsquare(n);
        }
        return n == 1;
    }

    static int sumofsquare(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
}
