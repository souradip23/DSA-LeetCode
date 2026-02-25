# 🧊 LeetCode 11 — Container With Most Water

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the *i-th* line are `(i, 0)` and `(i, height[i])`.

Find two lines that, together with the x-axis, form a container that holds the **most water**.  
Return the **maximum amount of water** a container can store.

> You may **not** slant the container. :contentReference[oaicite:0]{index=0}

---

## 📌 Problem Example

### Example 1

![Container With Most Water Diagram](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg) :contentReference[oaicite:1]{index=1}

**Input:**

height = [1,8,6,2,5,4,8,3,7]


**Output:**

49


**Explanation:**  
The max water container is formed between the lines at index `1` (height = 8) and index `8` (height = 7).  
Width = `8 - 1 = 7`  
Height = `min(8, 7) = 7`  
Area = `7 * 7 = 49` :contentReference[oaicite:2]{index=2}

---

### Example 2

**Input:**

height = [1,1]


**Output:**

1


---

## 💡 Observation

The area between two lines is:


area = min(height[left], height[right]) × (right - left)


- We want to **maximize** this area. :contentReference[oaicite:3]{index=3}

---

## 🚀 Optimal Approach — Two Pointers

We use **two pointers**:

1. Start `left` at `0`
2. Start `right` at `height.length - 1`
3. Calculate area
4. Move the pointer with the **smaller height inward**
5. Repeat until `left < right` :contentReference[oaicite:4]{index=4}

---