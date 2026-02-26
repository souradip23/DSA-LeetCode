# 69. Sqrt(x)

## 🧠 Problem Statement

Given a non-negative integer `x`, return the **square root of x rounded down to the nearest integer**.

The returned integer must also be non-negative.

⚠️ You **must not** use any built-in exponent function or operator.

Examples of forbidden operations:
- `pow(x, 0.5)` in C++
- `x ** 0.5` in Python

---

## 📌 Examples

### Example 1
**Input:**

x = 4


**Output:**

2


**Explanation:**  
The square root of 4 is exactly 2.

---

### Example 2
**Input:**

x = 8


**Output:**

2


**Explanation:**  
The square root of 8 is 2.82842...  
After rounding down, we return 2.

---

## 🔒 Constraints


0 <= x <= 2^31 - 1


---

# 🚀 Approach 1: Brute Force

### 💡 Idea

- Start from `i = 1`
- Keep checking `i * i <= x`
- When it exceeds `x`, return `i - 1`

---