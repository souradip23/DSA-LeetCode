# 387. First Unique Character in a String

## 🟢 Difficulty: Easy

---

## 📘 Problem Statement

Given a string `s`, find the **first non-repeating character** and return its index.

If it does not exist, return `-1`.

---

## 🖼️ Example 1

**Input**

s = "leetcode"


**Output**

0


**Explanation**  
`'l'` at index `0` appears only once.

---

## 🖼️ Example 2

**Input**

s = "loveleetcode"


**Output**

2


**Explanation**  
`'v'` is the first character that appears only once.

---

## 🖼️ Example 3

**Input**

s = "aabb"


**Output**

-1


**Explanation**  
All characters repeat.

---

## 🔒 Constraints

- `1 <= s.length <= 10^5`
- `s` consists only of lowercase English letters

---

# 💡 Key Idea — Frequency Counting

Since the string contains only lowercase letters:

👉 Use an array of size 26 to count character frequencies.

### Strategy

1. Count frequency of each character.
2. Traverse string again.
3. Return index of first character whose frequency is 1.
4. If none found → return `-1`.

---

# 🧠 Algorithm Steps

1. Create `int freq[26]`
2. First pass → count characters
3. Second pass → find first index where `freq[c - 'a'] == 1`

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n) |
| Space      | O(1) |

✔ Only 26 letters → constant space.

---
