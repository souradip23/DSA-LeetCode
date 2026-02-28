# 349. Intersection of Two Arrays

## 🟢 Difficulty: Easy

---

## 📘 Problem Statement

Given two integer arrays `nums1` and `nums2`, return an array of their **intersection**.

- Each element in the result must be **unique**
- You may return the result in **any order**

---

## 🖼️ Example 1

**Input**

nums1 = [1,2,2,1]
nums2 = [2,2]


**Output**

[2]


---

## 🖼️ Example 2

**Input**

nums1 = [4,9,5]
nums2 = [9,4,9,8,4]


**Output**

[9,4]


**Explanation**  
`[4,9]` is also valid.

---

## 🔒 Constraints

- `1 <= nums1.length, nums2.length <= 1000`
- `0 <= nums1[i], nums2[i] <= 1000`

---

# 💡 Approach 1 — Using HashSet (Recommended)

### 🔥 Key Idea

- Store elements of `nums1` in a `HashSet`
- Traverse `nums2`
- If element exists in set → add to result set
- Convert result set to array

This guarantees uniqueness automatically.

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n + m) |
| Space      | O(n) |

---