
public class IsoMorphicString {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> charForS = new HashMap<>();
        HashMap<Character, Integer> charForT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (!charForS.containsKey(c1)) {
                charForS.put(c1, i);
            }

            if (!charForT.containsKey(c2)) {
                charForT.put(c2, i);
            }

            if (!charForS.get(c1).equals(charForT.get(c2))) {
                return false;
            }
        }

        return true;
    }
}
