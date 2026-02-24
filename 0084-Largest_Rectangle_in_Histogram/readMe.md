# 📊 84. Largest Rectangle in Histogram

> Problem from LeetCode

---

## 🧩 Problem Statement

Given an array of integers `heights` representing the histogram's bar height where the width of each bar is `1`, return the area of the largest rectangle in the histogram.

---

## 📌 Example 1

### Input
heights = [2,1,5,6,2,3]

### Output
10

### Visualization

![Histogram Example 1](https://assets.leetcode.com/uploads/2021/01/04/histogram.jpg)

### Explanation

The largest rectangle is formed using heights **5 and 6**.

Area = 5 × 2 = 10

---

## 📌 Example 2

### Input
heights = [2,4]

### Output
4

### Visualization

![Histogram Example 2](https://assets.leetcode.com/uploads/2021/01/04/histogram-1.jpg)

---

## 🚀 Approaches

### 🔹 1. Brute Force (O(n²))

For each bar:
- Expand left until a smaller bar appears
- Expand right until a smaller bar appears
- Compute area:

Area = height × width

Keep track of the maximum area.

---

### 🔹 2. Optimal Approach – Monotonic Stack (O(n))

We maintain a stack of indices in increasing order of heights.

When we encounter a smaller height:
- Pop from stack
- Calculate area
- Update maximum area

Each element is pushed once and popped once.

Time Complexity: **O(n)**  
Space Complexity: **O(n)**

---