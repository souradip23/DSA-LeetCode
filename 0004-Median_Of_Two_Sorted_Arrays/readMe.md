# 📊 4. Median of Two Sorted Arrays

> Difficulty: Hard  
> Platform: LeetCode  

---

## 🧩 Problem Statement

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively,  
return the **median** of the two sorted arrays.

⚡ The overall run time complexity must be:


O(log (m + n))


---

## 🧪 Examples

### Example 1

**Input:**
nums1 = [1,3]  
nums2 = [2]

**Output:**
2.00000

**Explanation:**

Merged array → [1,2,3]  
Median → 2

---

### Example 2

**Input:**
nums1 = [1,2]  
nums2 = [3,4]

**Output:**
2.50000

**Explanation:**

Merged array → [1,2,3,4]  
Median → (2 + 3) / 2 = 2.5

---

## 📌 Constraints

- nums1.length == m  
- nums2.length == n  
- 0 ≤ m ≤ 1000  
- 0 ≤ n ≤ 1000  
- 1 ≤ m + n ≤ 2000  
- -10⁶ ≤ nums1[i], nums2[i] ≤ 10⁶  

---

# 🚀 Optimal Approach (Binary Search)

## 🔥 Key Idea

Instead of merging arrays (which would take O(m+n)),  
we use **Binary Search on the smaller array**.

We partition both arrays such that:

- Left partition contains half of total elements
- All elements on left ≤ all elements on right

If partition is correct → compute median.

---

## 🧠 Partition Concept

We choose partition index `i` in nums1:


i + j = (m + n + 1) / 2


Where:
- i = partition in nums1
- j = partition in nums2

We adjust `i` using binary search until:


maxLeft1 ≤ minRight2
AND
maxLeft2 ≤ minRight1