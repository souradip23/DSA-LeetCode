# 🟢 3Sum

## 📌 Problem Statement

Given an integer array `nums`, return all the **unique triplets** `[nums[i], nums[j], nums[k]]` such that:

- `i ≠ j`
- `i ≠ k`
- `j ≠ k`
- `nums[i] + nums[j] + nums[k] == 0`

The solution set must not contain duplicate triplets.

---

## 🧪 Examples

### Example 1

**Input:**

nums = [-1,0,1,2,-1,-4]


---

### Example 2

**Input:**

nums = [0,1,1]


**Output:**

[]


---

### Example 3

**Input:**

nums = [0,0,0]


**Output:**

[[0,0,0]]


---

## 📋 Constraints

- `3 <= nums.length <= 3000`
- `-10⁵ <= nums[i] <= 10⁵`

---

## 🧠 Approach (Two Pointer Technique)

1. Sort the array.
2. Fix one element using a loop.
3. Use two pointers (`left` and `right`) to find remaining two numbers.
4. Skip duplicates to ensure unique triplets.
5. Move pointers based on the sum:
   - If sum < 0 → move `left` forward.
   - If sum > 0 → move `right` backward.
   - If sum == 0 → store result and move both pointers.

---

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n²)`
- **Space Complexity:** `O(1)` (excluding result list)

---