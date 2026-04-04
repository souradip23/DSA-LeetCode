import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {

        //Using BigInteger 
        // BigInteger a=new BigInteger(num1);
        // BigInteger b=new BigInteger(num2);
        // BigInteger c=a.add(b);
        // return c.toString();

        // using Manual code

        StringBuilder res=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry!=0){
            int digit1=(i>=0)?num1.charAt(i)-'0':0;
            int digit2=(j>=0)?num2.charAt(j)-'0':0;
            int sum=carry+digit1+digit2;
            res.append(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        return res.reverse().toString();
    }
}