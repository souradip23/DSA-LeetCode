# 1392. Longest Happy Prefix

## 🧠 Problem Statement

A string is called a **happy prefix** if it is a **non-empty prefix** which is also a **suffix**, excluding the string itself.

Given a string `s`, return the **longest happy prefix** of `s`.  
Return an empty string `""` if no such prefix exists.

---

## 📌 Examples

### Example 1
**Input:**  

s = "level"


**Output:**  

"l"


**Explanation:**  
Prefixes (excluding full string):  
`"l"`, `"le"`, `"lev"`, `"leve"`

Suffixes:  
`"l"`, `"el"`, `"vel"`, `"evel"`

Longest common prefix & suffix = `"l"`

---

### Example 2
**Input:**  

s = "ababab"


**Output:**  

"abab"


**Explanation:**  
`"abab"` is the largest prefix which is also a suffix.  
Overlapping is allowed.

---

## 🚀 Brute Force Approach

### 💡 Idea

1. Start checking from length `n-1` down to `1`.
2. Compare:
   - Prefix → `s.substring(0, len)`
   - Suffix → `s.substring(n - len)`
3. If they are equal → return prefix.
4. If no match found → return empty string.

---
