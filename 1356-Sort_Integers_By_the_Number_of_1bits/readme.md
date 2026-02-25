# 1356. Sort Integers by The Number of 1 Bits

🟢 Difficulty: Easy  

---

## 📘 Problem Statement

You are given an integer array `arr`.

Sort the integers in the array in ascending order by:

1. The number of **1's in their binary representation**
2. If two or more integers have the same number of 1's, then sort them in **ascending numerical order**

Return the array after sorting it.

---

## 🧪 Example 1

### Input

arr = [0,1,2,3,4,5,6,7,8]


### Output

[0,1,2,4,8,3,5,6,7]


### Explanation
- `[0]` → 0 set bits  
- `[1,2,4,8]` → 1 set bit  
- `[3,5,6]` → 2 set bits  
- `[7]` → 3 set bits  

Sorted by bit count →  
`[0,1,2,4,8,3,5,6,7]`

---

## 🧪 Example 2

### Input

arr = [1024,512,256,128,64,32,16,8,4,2,1]


### Output

[1,2,4,8,16,32,64,128,256,512,1024]


### Explanation
All integers have exactly **1 set bit**, so they are sorted in normal ascending order.

---

## 📌 Constraints

- `1 <= arr.length <= 500`
- `0 <= arr[i] <= 10^4`

---

# 💡 Approach

- Use `Integer.bitCount()` to count the number of set bits.
- Sort the array based on:
  - First → bit count
  - Second → numerical value (ascending)

---

# ✅ Java Solution (Optimal – O(n log n))

```java
import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(temp, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);

            if (countA == countB) {
                return a - b;
            }
            return countA - countB;
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
}