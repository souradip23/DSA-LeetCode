
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int len = 0;
        for (int i = str.length - 1; i >= 0; i--) {
            String newstr = str[i];
            len = newstr.length();
            break;
        }
        return len;
    }

    public int lengthOfLastWord2(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;

            } else {
                break;
            }
        }
        return count;
    }
}
