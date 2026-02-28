# 205. Isomorphic Strings

## 🟢 Difficulty: Easy

---

## 📘 Problem Statement

Given two strings `s` and `t`, determine if they are **isomorphic**.

Two strings are isomorphic if:

- Characters in `s` can be replaced to get `t`
- All occurrences of a character must map to the same character
- No two characters may map to the same character
- A character may map to itself

---

## 🖼️ Example 1

**Input**

s = "egg"
t = "add"


**Output**

true


**Explanation**
- 'e' → 'a'
- 'g' → 'd'

---

## 🖼️ Example 2

**Input**

s = "f11"
t = "b23"


**Output**

false


**Explanation**
'1' cannot map to both '2' and '3'.

---

## 🖼️ Example 3

**Input**

s = "paper"
t = "title"


**Output**

true


---

## 🔒 Constraints

- `1 <= s.length <= 5 * 10^4`
- `t.length == s.length`
- `s` and `t` consist of any valid ASCII character

---

# 💡 Key Idea — Two-Way Mapping

To ensure isomorphism:

- Each character in `s` must map to exactly one character in `t`
- No two characters in `s` map to the same character in `t`

👉 We must check mapping in **both directions**.

---

# 🧠 Approach 1 — Using Two HashMaps (Recommended)

### 🔥 Algorithm

1. If lengths differ → return false
2. Create:
   - `mapST` → mapping from `s` to `t`
   - `mapTS` → mapping from `t` to `s`
3. Traverse characters:
   - If mapping exists, verify consistency
   - Otherwise, create mapping
4. If conflict found → return false

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n) |
| Space      | O(1) |

✔ ASCII character set → at most 256 possible mappings

---