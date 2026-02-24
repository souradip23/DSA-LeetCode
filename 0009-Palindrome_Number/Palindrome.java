public class Palindrome {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int sum = 0;
        while (x > sum) {
            int rem = x % 10;
            sum = sum * 10 + rem;
            x /= 10;
        }
        return x == sum || x == sum / 10;
    }

}