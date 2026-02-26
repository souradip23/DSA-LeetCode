# 34. Find First and Last Position of Element in Sorted Array

**Platform:** :contentReference[oaicite:0]{index=0}  
**Difficulty:** Medium  
**Topics:** Array, Binary Search  

---

## 📘 Problem Statement

Given an array of integers `nums` sorted in **non-decreasing order**, find the **starting and ending position** of a given `target` value.

If the `target` is not found in the array, return `[-1, -1]`.

> You must write an algorithm with **O(log n)** runtime complexity.

---

## 🧪 Examples

### Example 1

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]


### Example 2

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]


### Example 3

Input: nums = [], target = 0
Output: [-1,-1]


---

## 🚫 Brute Force Is Not Allowed

A linear scan would take **O(n)** time, which violates the requirement.

👉 We must use **Binary Search**.

---

## ✅ Optimized Approach (Binary Search)

### 💡 Key Idea

Use **two binary searches**:
1. One to find the **first occurrence** of `target`
2. One to find the **last occurrence** of `target`

Because the array is sorted, binary search works efficiently.

---

## 🧠 Algorithm

1. Initialize result as `[-1, -1]`
2. Perform binary search to find the **leftmost index** of `target`
3. If not found, return `[-1, -1]`
4. Perform binary search to find the **rightmost index** of `target`
5. Return both indices

---

