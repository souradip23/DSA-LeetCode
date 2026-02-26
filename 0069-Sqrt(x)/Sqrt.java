
public class Sqrt {

    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public int mySqrt1(int x) {
        if (x < 2) {
            return x;
        }

        int i = 2;

        while ((long) i * i <= x) { // cast to long to avoid overflow
            i++;
        }

        return i - 1;
    }
}
