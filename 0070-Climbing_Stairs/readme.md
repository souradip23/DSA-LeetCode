# 70. Climbing Stairs

## 🟢 Difficulty: Easy

---

## 📘 Problem Statement

You are climbing a staircase. It takes `n` steps to reach the top.

Each time you can either climb:

- 1 step  
- 2 steps  

Return the number of **distinct ways** to reach the top.

---

## 🖼️ Example 1

**Input**

n = 2


**Output**

2


**Explanation**
1. 1 + 1  
2. 2  

---

## 🖼️ Example 2

**Input**

n = 3


**Output**

3


**Explanation**
1. 1 + 1 + 1  
2. 1 + 2  
3. 2 + 1  

---

## 🔒 Constraints

- `1 <= n <= 45`

---

# 💡 Key Insight — This is Fibonacci!

To reach step `n`, you can:

- Come from step `n-1` (1 step jump)
- Come from step `n-2` (2 step jump)

So the recurrence relation is:


::contentReference[oaicite:0]{index=0}


This is exactly the **Fibonacci sequence**.

---

# 🧠 Dynamic Programming Approach

### Base Cases

- `f(1) = 1`
- `f(2) = 2`

### Build Up

Compute iteratively until `n`.

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n) |
| Space      | O(1) |

---