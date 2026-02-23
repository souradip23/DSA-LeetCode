# 🟢 Two Sum

## 📌 Problem Statement

Given an integer array `nums` and an integer `target`, return the indices of the two numbers such that:

nums[i] + nums[j] == target

### Conditions:
- You may assume that each input has exactly one solution.
- You may not use the same element twice.
- Return the answer in any order.

---

## 🧪 Example

### Example 1

**Input:**

nums = [2,7,11,15]
target = 9


**Output:**

[0,1]


**Explanation:**

nums[0] + nums[1] = 2 + 7 = 9


---

## 📋 Constraints

- 2 <= nums.length <= 10⁴
- -10⁹ <= nums[i] <= 10⁹
- -10⁹ <= target <= 10⁹
- Only one valid answer exists.

---

# 🧠 Approaches

---

# 1️⃣ Brute Force Approach

### 💡 Idea
Check every pair using two nested loops.

### ⏱ Complexity
- Time Complexity: **O(n²)**
- Space Complexity: **O(1)**