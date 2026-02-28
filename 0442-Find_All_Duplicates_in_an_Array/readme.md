# 442. Find All Duplicates in an Array

## 🟡 Difficulty: Medium

---

## 📘 Problem Statement

Given an integer array `nums` of length `n` where:

- `1 <= nums[i] <= n`
- Each integer appears **once or twice**

Return all elements that appear **twice**.

⚠️ Requirements:
- Time Complexity: **O(n)**
- Extra Space: **O(1)** (excluding output array)

---

## 🖼️ Example 1

**Input**

nums = [4,3,2,7,8,2,3,1]


**Output**

[2,3]


---

## 🖼️ Example 2

**Input**

nums = [1,1,2]


**Output**

[1]


---

## 🖼️ Example 3

**Input**

nums = [1]


**Output**

[]


---

## 🔒 Constraints

- `n == nums.length`
- `1 <= n <= 10^5`
- `1 <= nums[i] <= n`
- Each element appears once or twice

---

# 💡 Key Insight — Use Index Marking (Negative Trick)

Since:

- Numbers are in range `[1, n]`
- Array size is `n`

👉 Each number maps to an index:

number x → index (x - 1)


### 🔥 Trick

For each number `x`:
1. Go to index `abs(x) - 1`
2. If value at that index is already negative → duplicate found
3. Otherwise → make it negative to mark visited

This uses the input array itself for tracking — no extra space needed.

---

# 🧠 Algorithm Steps

1. Create empty result list.
2. Iterate through array:
   - Let `index = abs(nums[i]) - 1`
   - If `nums[index] < 0`
     - Add `abs(nums[i])` to result
   - Else
     - Make `nums[index]` negative
3. Return result.

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n) |
| Space      | O(1) |

✔ Only output array uses extra space (allowed).

---
