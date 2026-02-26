
public class MaxReapetingSubstring {

    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String sub = word;
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.contains(sub)) {
                count++;
            }
            sub += word;
        }
        return count;
    }
}
