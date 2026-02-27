# 58. Length of Last Word

## 🟢 Difficulty: Easy

### 📘 Problem Statement

Given a string `s` consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

---

## 🖼️ Example 1

**Input**

s = "Hello World"


**Output**

5


**Explanation**
The last word is `"World"` with length 5.

---

## 🖼️ Example 2

**Input**

s = " fly me to the moon "


**Output**

4


**Explanation**
The last word is `"moon"` with length 4.

---

## 🖼️ Example 3

**Input**

s = "luffy is still joyboy"


**Output**

6


**Explanation**
The last word is `"joyboy"` with length 6.

---

## 🔒 Constraints

- 1 <= s.length <= 10^4
- `s` consists of only English letters and spaces `' '`.
- There will be at least one word in `s`.

---

## 💡 Approach — Reverse Traversal

We traverse the string from the end:

1. Skip trailing spaces.
2. Count characters until we encounter a space.
3. Return the count.

This avoids using extra space (like `split()`).

---

## 🔹 Algorithm

1. Initialize `length = 0`
2. Start from the end of the string
3. Skip trailing spaces
4. Count characters until a space is found
5. Return `length`

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n)   |
| Space      | O(1)   |

---
