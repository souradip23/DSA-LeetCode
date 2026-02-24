# 🔄 7. Reverse Integer

> Difficulty: Medium  
> Platform: LeetCode  

---

## 🧩 Problem Statement

Given a signed **32-bit integer** `x`, return `x` with its digits reversed.

If reversing `x` causes the value to go outside the signed 32-bit integer range:


[-2³¹, 2³¹ - 1]


then return `0`.

⚠️ You are NOT allowed to use 64-bit integers.

---

## 🧪 Examples

### Example 1
**Input:**  
x = 123  

**Output:**  
321  

---

### Example 2
**Input:**  
x = -123  

**Output:**  
-321  

---

### Example 3
**Input:**  
x = 120  

**Output:**  
21  

---

## 📌 Constraints


-2³¹ ≤ x ≤ 2³¹ - 1


Which means:


-2147483648 ≤ x ≤ 2147483647


---

## 🚀 Approach

### 🔹 Key Idea

We extract digits one by one using:


digit = x % 10
x = x / 10


Then build the reversed number:


rev = rev * 10 + digit


---

### ⚠️ Overflow Handling

Before multiplying by 10, we must check:


rev > Integer.MAX_VALUE / 10
rev < Integer.MIN_VALUE / 10


If true → return `0`

This prevents 32-bit overflow.

---