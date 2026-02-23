# 🟢 3. Longest Substring Without Repeating Characters

## 📌 Problem Statement

Given a string `s`, find the length of the longest substring without duplicate characters.

> ⚠️ Note: The answer must be a **substring**, not a subsequence.

---

## 🧪 Examples

### Example 1

**Input:**

s = "abcabcbb"


**Output:**

3


**Explanation:**
The answer is `"abc"`, with length 3.  
Other valid substrings are `"bca"` and `"cab"`.

---

### Example 2

**Input:**

s = "bbbbb"


**Output:**

1


**Explanation:**
The answer is `"b"`, with length 1.

---

### Example 3

**Input:**

s = "pwwkew"


**Output:**

3


**Explanation:**
The answer is `"wke"`, with length 3.  
`"pwke"` is a subsequence, not a substring.

---

## 📋 Constraints

- `0 <= s.length <= 5 * 10⁴`
- `s` consists of English letters, digits, symbols, and spaces.

---

# 🧠 Approach (Sliding Window Technique)

### 💡 Idea

We use a **sliding window** with two pointers:

- Expand the window using `right`
- If a duplicate character is found:
  - Shrink the window using `left`
- Keep track of maximum window length

We use a `HashSet` to maintain unique characters inside the window.

---

## ⏱ Complexity Analysis

- **Time Complexity:** `O(n)`  
  Each character is visited at most twice.

- **Space Complexity:** `O(128)`  
  (ASCII character set)

---