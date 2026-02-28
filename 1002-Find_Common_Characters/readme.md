# 1002. Find Common Characters

## 🟢 Difficulty: Easy

---

## 📘 Problem Statement

Given a string array `words`, return an array of **all characters that appear in every string** (including duplicates).

You may return the answer in **any order**.

---

## 🖼️ Example 1

**Input**

words = ["bella","label","roller"]


**Output**

["e","l","l"]


**Explanation**
- `e` appears in all words once
- `l` appears in all words at least twice
- So result contains: `e, l, l`

---

## 🖼️ Example 2

**Input**

words = ["cool","lock","cook"]


**Output**

["c","o"]


---

## 🔒 Constraints

- `1 <= words.length <= 100`
- `1 <= words[i].length <= 100`
- `words[i]` consists of lowercase English letters

---

# 💡 Key Idea — Frequency Intersection

Since all characters are lowercase English letters:

👉 Use a frequency array of size 26.

### Strategy:

1. Create a frequency array from the **first word**.
2. For each remaining word:
   - Build its frequency array.
   - Take the **minimum frequency** for each character.
3. Build result using the final minimum frequencies.

This ensures duplicates are handled correctly.

---

# 🧠 Algorithm Steps

1. Initialize `minFreq[26]` using first word.
2. For every other word:
   - Count frequency into `freq[26]`
   - Update:
     ```
     minFreq[i] = min(minFreq[i], freq[i])
     ```
3. Add characters to result according to `minFreq`.

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n * m) |
| Space      | O(1) |

Where:
- `n` = number of words
- `m` = average word length  
- Space is constant (26 letters only)

---