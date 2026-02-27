# 26. Remove Duplicates from Sorted Array

## 🟢 Easy

### 📘 Problem Statement

Given an integer array `nums` sorted in **non-decreasing order**, remove the duplicates **in-place** such that each unique element appears only once.

The relative order of the elements should be kept the same.

Return the number of unique elements `k`.

After removing duplicates:
- The first `k` elements of `nums` should contain the unique values in sorted order.
- The remaining elements beyond index `k - 1` can be ignored.

---

## 🧪 Custom Judge

The judge will test your solution with:

```java
int[] nums = [...];
int[] expectedNums = [...];

int k = removeDuplicates(nums);

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
🖼️ Example 1

Input:

nums = [1,1,2]

Output:

2, nums = [1,2,_]

Explanation:
Your function should return k = 2,
with the first two elements being 1 and 2.

🖼️ Example 2

Input:

nums = [0,0,1,1,1,2,2,3,3,4]

Output:

5, nums = [0,1,2,3,4,_,_,_,_,_]

Explanation:
Your function should return k = 5,
with the first five elements being 0,1,2,3,4.

🔒 Constraints

1 <= nums.length <= 3 * 10^4

-100 <= nums[i] <= 100

nums is sorted in non-decreasing order