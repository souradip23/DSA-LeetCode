# 27. Remove Element

## 🟢 Difficulty: Easy

### 📘 Problem Statement

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` **in-place**.

The order of the elements may be changed.

Return the number of elements in `nums` that are **not equal** to `val`.

After removal:

- The first `k` elements of `nums` should contain the elements not equal to `val`.
- The remaining elements are not important.
- Return `k`.

---

## 🧪 Custom Judge

\`\`\`java
int[] nums = [...];
int val = ...;
int[] expectedNums = [...]; // sorted, no values equal to val

int k = removeElement(nums, val);

assert k == expectedNums.length;
sort(nums, 0, k);

for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
\`\`\`

---

## 🖼️ Example 1

**Input**

nums = [3,2,2,3]
val = 3


**Output**

2


**Modified Array**

[2,2,,]


---

## 🖼️ Example 2

**Input**

nums = [0,1,2,2,3,0,4,2]
val = 2


**Output**

5


**Modified Array (any order is valid)**

[0,1,4,0,3,,,_]


---

## 🔒 Constraints

- 0 <= nums.length <= 100  
- 0 <= nums[i] <= 50  
- 0 <= val <= 100  

---

## 💡 Approach — Two Pointer (Overwrite Method)

We maintain a pointer `k` to track the position where the next valid element should be placed.

### 🔹 Algorithm

1. Initialize `k = 0`
2. Traverse the array
3. If `nums[i] != val`
   - Assign `nums[k] = nums[i]`
   - Increment `k`
4. Return `k`

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n)   |
| Space      | O(1)   |

---