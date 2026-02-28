# 202. Happy Number

## 🟢 Difficulty: Easy

---

## 📘 Problem Statement

Write an algorithm to determine if a number `n` is a **happy number**.

A happy number is defined by the following process:

1. Start with any positive integer.
2. Replace the number with the **sum of the squares of its digits**.
3. Repeat the process until:
   - The number becomes `1` → ✅ Happy Number
   - OR it enters a cycle that does not include `1` → ❌ Not Happy

Return `true` if `n` is happy, otherwise return `false`.

---

## 🖼️ Example 1

**Input**

n = 19


**Output**

true


**Explanation**

19 → 1² + 9² = 82  
82 → 8² + 2² = 68  
68 → 6² + 8² = 100  
100 → 1² + 0² + 0² = 1  

---

## 🖼️ Example 2

**Input**

n = 2


**Output**

false


---

## 🔒 Constraints

- `1 <= n <= 2^31 - 1`

---

# 💡 Key Insight — Cycle Detection

If the number is not happy, it will eventually enter a **cycle**.

So the problem becomes:
👉 Detect whether a cycle occurs.

---

# 🧠 Approach 1 — Using HashSet (Cycle Detection)

### 🔥 Algorithm

1. Create a `HashSet` to store seen numbers.
2. While `n != 1`:
   - If `n` is already in set → cycle detected → return false
   - Add `n` to set
   - Replace `n` with sum of squares of digits
3. If `n == 1` → return true

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(log n) |
| Space      | O(log n) |

---