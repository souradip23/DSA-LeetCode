# 1668. Maximum Repeating Substring

## 🟢 Difficulty: Easy

---

## 📘 Problem Statement

For a string `sequence`, a string `word` is **k-repeating** if `word` concatenated `k` times is a substring of `sequence`.

The word's **maximum k-repeating value** is the highest value `k` where `word` is k-repeating in `sequence`.

If `word` is not a substring of `sequence`, the maximum k-repeating value is `0`.

Return the maximum k-repeating value of `word` in `sequence`.

---

## 📝 Examples

### Example 1

**Input:**

sequence = "ababc"
word = "ab"


**Output:**

2


**Explanation:**  
"abab" (which is "ab" repeated 2 times) is a substring of "ababc".

---

### Example 2

**Input:**

sequence = "ababc"
word = "ba"


**Output:**

1


**Explanation:**  
"ba" is a substring of "ababc",  
but "baba" is not.

---

### Example 3

**Input:**

sequence = "ababc"
word = "ac"


**Output:**

0


**Explanation:**  
"ac" is not a substring of "ababc".

---

## 📌 Constraints

- `1 <= sequence.length <= 100`
- `1 <= word.length <= 100`
- `sequence` and `word` contain only lowercase English letters.

---

## 💡 Approach

1. Start with `k = 1`
2. Keep concatenating `word` (`word`, `word + word`, `word + word + word`, ...)
3. Check if the concatenated string is still a substring of `sequence`
4. Stop when it is no longer found
5. Return the maximum valid `k`

Since the maximum length is small (≤ 100), this brute-force approach works efficiently.

---