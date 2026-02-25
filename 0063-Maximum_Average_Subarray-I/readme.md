# 📘 643. Maximum Average Subarray I

🟢 Difficulty: Easy  

---

## 📝 Problem Statement

You are given an integer array `nums` consisting of `n` elements and an integer `k`.

Find a **contiguous subarray** of length `k` that has the **maximum average value** and return this value.

Any answer with a calculation error less than `10⁻⁵` will be accepted.

---

## 🧪 Example 1

### Input

nums = [1,12,-5,-6,50,3], k = 4


### Output

12.75000


### Explanation

Subarray of length 4 with maximum sum:


[12, -5, -6, 50]


Sum = `12 - 5 - 6 + 50 = 51`  
Average = `51 / 4 = 12.75`

---

## 🧪 Example 2

### Input

nums = [5], k = 1


### Output

5.00000


---

## 📌 Constraints

- `1 <= k <= n <= 10⁵`
- `-10⁴ <= nums[i] <= 10⁴`

---

# 💡 Approach — Sliding Window (Optimal)

Instead of calculating sum for every subarray (which would take O(n²)),  
we use the **Sliding Window Technique**.

### 🔹 Steps:

1. Calculate sum of first `k` elements.
2. Store it as `maxSum`.
3. Move the window forward:
   - Add next element
   - Remove first element of previous window
4. Update `maxSum`
5. Return `maxSum / k`

---