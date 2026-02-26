# 66. Plus One

## 🧠 Problem Statement

You are given a large integer represented as an integer array `digits`, where each `digits[i]` is the ith digit of the integer.

The digits are ordered from **most significant to least significant** in left-to-right order.

The large integer does not contain any leading 0's.

Your task is to increment the integer by one and return the resulting array of digits.

---

## 📌 Examples

### Example 1
**Input:**

digits = [1,2,3]


**Output:**

[1,2,4]


**Explanation:**
The array represents the integer 123.  
123 + 1 = 124  

---

### Example 2
**Input:**

digits = [4,3,2,1]


**Output:**

[4,3,2,2]


**Explanation:**
The array represents the integer 4321.  
4321 + 1 = 4322  

---

### Example 3
**Input:**

digits = [9]


**Output:**

[1,0]


**Explanation:**
The array represents the integer 9.  
9 + 1 = 10  

---

## 🔒 Constraints

- `1 <= digits.length <= 100`
- `0 <= digits[i] <= 9`
- `digits` does not contain any leading 0's

---

# 🚀 Approach

### 💡 Idea

- Start from the **last digit**.
- If the digit is less than 9 → increment it and return.
- If the digit is 9 → set it to 0 and continue (carry forward).
- If all digits are 9 → create a new array with size `n + 1` and set first element to `1`.

---