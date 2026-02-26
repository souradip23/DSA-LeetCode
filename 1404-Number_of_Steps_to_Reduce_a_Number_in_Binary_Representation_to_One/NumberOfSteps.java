public class NumberOfSteps {

    // O(n) --> run time error
    public int numSteps1(String s) {
        int num = Integer.parseInt(s, 2); // because parseInt fails for the large input
        int step = 0;

        while (num > 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num + 1;
            }
            step++;

        }
        return step;
    }

    // O(n) --> Normal case (Best Case)
    public int numSteps(String s) {
        int step = 0;
        int carry = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            char bit = s.charAt(i);
            if (bit == '0') {
                if (carry == 0) {
                    step += 1;
                } else {
                    step += 2;
                }
            } else {
                if (carry == 0) {
                    step += 2;
                    carry = 1;
                } else {
                    step += 1;
                }
            }
        }
        return step + carry;
    }

}