class Solution {
    public final int MOD = 1000000007;

    public int numOfSubarrays(int[] arr) {
        // brute - force - O(n2)
        //    int count=0;
        //    for(int i=0;i<arr.length;i++){
        //     int sum=0;
        //     for(int j=i;j<arr.length;j++){
        //         sum+=arr[j];
        //         if(sum%2!=0){
        //             count++;
        //         }
        //     }
        //    } 
        //    return count;
        // optimal sol -O(n)
        long even = 1;
        long odd = 0;
        long sum = 0;
        long ans = 0;
        for (int num : arr) {
            sum += num;
            if (sum % 2 == 0) {
                ans += odd;
                even++;
            } else {
                ans += even;
                odd++;
            }
            ans %= MOD;
        }
        return (int) ans;

    }
}