# 📘 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

🟡 Difficulty: Medium  

---

## 📝 Problem Statement

Given an integer array `arr` and two integers `k` and `threshold`,  
return the number of **contiguous sub-arrays** of size `k` whose average is **greater than or equal to** `threshold`.

---

## 🧪 Example 1

### Input

arr = [2,2,2,2,5,5,5,8]
k = 3
threshold = 4


### Output

3


### Explanation

Sub-arrays of size 3:


[2,2,2] → avg = 2
[2,2,2] → avg = 2
[2,2,5] → avg = 3
[2,5,5] → avg = 4 ✅
[5,5,5] → avg = 5 ✅
[5,5,8] → avg = 6 ✅


Valid subarrays = **3**

---

## 🧪 Example 2

### Input

arr = [11,13,17,23,29,31,7,5,2,3]
k = 3
threshold = 5


### Output

6


---

## 📌 Constraints

- `1 <= arr.length <= 10⁵`
- `1 <= arr[i] <= 10⁴`
- `1 <= k <= arr.length`
- `0 <= threshold <= 10⁴`

---

# 💡 Key Observation

Instead of checking:


average >= threshold


We can convert it to:


sum >= threshold * k


This avoids floating-point division and makes it faster.

---

# 🚀 Approach — Sliding Window

1. Calculate sum of first `k` elements.
2. Check if sum ≥ `threshold * k`
3. Slide the window:
   - Add next element
   - Remove previous element
4. Count valid windows.

---