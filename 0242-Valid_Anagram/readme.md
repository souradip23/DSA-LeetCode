# 242. Valid Anagram

## 🟢 Difficulty: Easy

---

## 📘 Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an **anagram** of `s`, otherwise return `false`.

An anagram is a word formed by rearranging the letters of another word using **all original letters exactly once**.

---

## 🖼️ Example 1

**Input**

s = "anagram"
t = "nagaram"


**Output**

true


---

## 🖼️ Example 2

**Input**

s = "rat"
t = "car"


**Output**

false


---

## 🔒 Constraints

- `1 <= s.length, t.length <= 5 * 10^4`
- `s` and `t` consist of lowercase English letters

---

# 💡 Optimal Approach — Frequency Array (O(n))

Since only lowercase English letters are used:

👉 Use an integer array of size 26.

---

## 🧠 Algorithm

1. If lengths are different → return `false`.
2. Create `int freq[26]`.
3. Traverse both strings:
   - Increment count for `s`
   - Decrement count for `t`
4. If all values in array are `0` → they are anagrams.

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n) |
| Space      | O(1) |

✔ Constant space because only 26 letters.

---