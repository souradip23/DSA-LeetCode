class Solution {

    long sumofdigit(long num){
        long sum = 0;

        while(num != 0){
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public long sumAndMultiply(int n) {

        String a = String.valueOf(n);

        StringBuilder ab = new StringBuilder();

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != '0'){
                ab.append(a.charAt(i));
            }
        }

        if(ab.length() == 0)
            return 0;

        long val = Long.parseLong(ab.toString());

        long sum = sumofdigit(val);

        return val * sum;
    }
}