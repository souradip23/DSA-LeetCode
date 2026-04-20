class Solution {
    // static int sumOfSquare(int n){
    //     int sum=0;
    //     while(n!=0){
    //         int rem=n%10;
    //         sum+=rem*rem;
    //         n/=10;
    //     }
    //     return sum;
    // }

    // public boolean isHappy(int n) {
    //     HashSet<Integer> set=new HashSet<>();
    //     while(n!=1 && !set.contains(n)){
    //         set.add(n);
    //         n=sumOfSquare(n);
    //     }
    //     return n==1;
    // }
        // Function to calculate sum of squares of digits
    private static int getNext(int n) {
        int total = 0;
        while (n > 0) {
            int digit = n % 10;
            total += digit * digit;
            n /= 10;
        }
        return total;
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while (true) {
            slow = getNext(slow);                 // 1 step
            fast = getNext(getNext(fast));        // 2 steps

            if (fast == 1) {
                return true;                      // happy number
            }
            if (slow == fast) {
                return false;                     // cycle detected
            }
        }
    }
}