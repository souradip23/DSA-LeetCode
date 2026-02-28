# 268. Missing Number

## 🟢 Difficulty: Easy

---

## 📘 Problem Statement

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`,  
return the **only number missing** from the range.

---

## 🖼️ Example 1

**Input**

nums = [3,0,1]


**Output**

2


**Explanation**
n = 3 → numbers should be in range `[0,3]`.  
Missing number is `2`.

---

## 🖼️ Example 2

**Input**

nums = [0,1]


**Output**

2


---

## 🖼️ Example 3

**Input**

nums = [9,6,4,2,3,5,7,0,1]


**Output**

8


---

## 🔒 Constraints

- `n == nums.length`
- `1 <= n <= 10^4`
- `0 <= nums[i] <= n`
- All numbers are unique

---

# 💡 Optimal Approach — Mathematical Formula (O(1) Space)

### 🔥 Key Idea

The sum of numbers from `0` to `n` is:



If we subtract the actual array sum from this expected sum,  
the difference is the missing number.

---

## 🧠 Algorithm Steps

1. Compute expected sum using formula.
2. Compute actual sum of array.
3. Return `expected - actual`.

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n) |
| Space      | O(1) |

✔ Meets follow-up requirement.

---