# 9. Palindrome Number

**Platform:** LeetCode  
**Difficulty:** Easy  

---

## 📝 Problem Statement

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A palindrome number reads the same forward and backward.

---

## 📌 Examples

### Example 1
Input:

x = 121

Output:

true

Explanation: 121 reads the same from left to right and right to left.

---

### Example 2
Input:

x = -121

Output:

false

Explanation: From left to right, it reads -121. From right to left, it becomes 121-.

---

### Example 3
Input:

x = 10

Output:

false

Explanation: Reads 01 from right to left.

---

## 🔒 Constraints


-2^31 <= x <= 2^31 - 1


---

## 🚀 Follow-up

Solve it **without converting the integer into a string**.

---

# 💡 Approach (Without String Conversion)

### 🔎 Key Observations

1. Negative numbers are not palindrome.
2. Numbers ending with `0` (except `0` itself) are not palindrome.
3. Reverse only **half** of the number to avoid overflow.

---

## 🧠 Algorithm

1. If `x < 0`, return `false`.
2. If `x % 10 == 0 && x != 0`, return `false`.
3. Reverse half of the digits.
4. Compare:
   - If even digits → `x == reversedHalf`
   - If odd digits → `x == reversedHalf / 10`

---