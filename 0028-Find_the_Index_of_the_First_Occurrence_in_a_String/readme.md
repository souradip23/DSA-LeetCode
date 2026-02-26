# 28. Find the Index of the First Occurrence in a String

## 🟢 Difficulty: Easy

---

## 📘 Problem Statement

Given two strings `needle` and `haystack`, return the **index of the first occurrence** of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

---

## 📝 Examples

### Example 1

**Input:**

haystack = "sadbutsad"
needle = "sad"


**Output:**

0


**Explanation:**  
"sad" occurs at index 0 and 6.  
The first occurrence is at index 0.

---

### Example 2

**Input:**

haystack = "leetcode"
needle = "leeto"


**Output:**

-1


**Explanation:**  
"leeto" does not occur in "leetcode".

---

## 📌 Constraints

- `1 <= haystack.length, needle.length <= 10^4`
- `haystack` and `needle` consist of only lowercase English letters.

---

## 💡 Approach

We iterate through the `haystack` and compare each substring of length `needle.length()` with `needle`.

If all characters match, return the starting index.

If no match is found after checking all possible positions, return `-1`.

---